package com.app.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IAppRepository;
import com.app.model.AppModel;
import com.app.service.IAppService;

@Service("iAppService")
public class AppServiceImpl implements IAppService {
	private static final Logger LOGGER = Logger.getLogger(AppServiceImpl.class);

	@Autowired
	IAppRepository iAppRepository;

	/**
	 * Extract file from zip archive.
	 *
	 * @throws Exception
	 */
	public void processXMLfromZipFile(String inputFile) throws Exception {
		ZipFile zipFile = new ZipFile(inputFile);
		try {
			Enumeration<? extends ZipEntry> zipEntryEnum = zipFile.entries();
			while (zipEntryEnum.hasMoreElements()) {
				extractEntry(zipFile, zipEntryEnum.nextElement());
			}
		} finally {
			zipFile.close();
		}
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
			String fileAsString = sb.toString();
			JSONObject obj = XML.toJSONObject(fileAsString);
			AppModel appModel = new AppModel();
			appModel.setFilename("");
			appModel.setXmlData(obj.toString());
			iAppRepository.save(appModel);
		} finally {
			if (os != null) {
				os.close();
			}
			if (is != null) {
				is.close();
			}
		}
	}

}
