package com.app.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IRepository;
import com.app.model.AppModel;
import com.app.model.PersistentObject;
import com.app.model.Return;
import com.app.service.IAppService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Service
public class AppServiceImpl implements IAppService {
	private static final Logger LOGGER = Logger.getLogger(AppServiceImpl.class);

	private final String LOCAL_FILE_LOCATION = "/abcd.zip";

	@Autowired
	IRepository iAppRepository;

	/**
	 * Extract file from zip archive.
	 *
	 * @throws Exception
	 */
	public void processXMLfromZipFile(String inputFileUrl) throws Exception {

		LOGGER.debug("Downloading file from the Url : " + inputFileUrl);
		FileUtils.copyURLToFile(new URL(inputFileUrl), new File(LOCAL_FILE_LOCATION));
		LOGGER.debug("Download Complete!");

		LOGGER.debug("Extracting the files!");
		ZipFile zipFile = new ZipFile(LOCAL_FILE_LOCATION);
		try {
			Enumeration<? extends ZipEntry> zipEntryEnum = zipFile.entries();
			while (zipEntryEnum.hasMoreElements()) {
				extractEntry(zipFile, zipEntryEnum.nextElement());
			}
		} finally {
			zipFile.close();
		}
		LOGGER.debug("Extraction Complete!");
	}

	/**
	 * Util method to extract zip file entries.
	 * 
	 * @param zf
	 * @param entry
	 * @param destDir
	 * @throws IOException
	 */
	private void extractEntry(ZipFile zf, ZipEntry entry) throws IOException {
		LOGGER.debug("Started reading file : " + entry.getName());

		InputStream is = null;
		OutputStream os = null;

		try {

			is = zf.getInputStream(entry);
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line = buf.readLine();
			StringBuilder sb = new StringBuilder();
			while (line != null) {
				sb.append(line);
				line = buf.readLine();
			}

			parseFile(entry.getName(), sb.toString());

		} finally {
			if (os != null) {
				os.close();
			}
			if (is != null) {
				is.close();
			}
		}
		LOGGER.debug("File reading complete : " + entry.getName());
	}

	private void parseFile(String fileName, String fileData) {
		LOGGER.debug("Started parsing the file : " + fileName);
		switch (FilenameUtils.getExtension(fileName).toLowerCase()) {
		case "xml":
			LOGGER.debug("file is of xml format");

			JacksonXmlModule xmlModule = new JacksonXmlModule();
			xmlModule.setDefaultUseWrapper(false);
			ObjectMapper objectMapper = new XmlMapper(xmlModule);
			try {
				AppModel appModel = new AppModel();
				Return return1 = objectMapper.readValue(fileData, Return.class);
				appModel.setReturn1(return1);
				PersistentObject persistentObject = appModel;
				persistentObject.setFileId(fileName);
				LOGGER.debug("Parsing complete : " + fileName);
				LOGGER.debug("saving into db Persistance");
				iAppRepository.save(((AppModel) persistentObject).getReturn1());
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		default:
			LOGGER.debug("file is not of xml format!");
			break;
		}
	}
}
