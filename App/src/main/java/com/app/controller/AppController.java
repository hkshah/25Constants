package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.config.AppErrorResponse;
import com.app.config.AppException;
import com.app.model.AppResponse;
import com.app.service.IAppService;
import com.app.util.AppConstants;

@RestController
@RequestMapping(value = "/25constants")
public class AppController {

	@Autowired
	private IAppService iAppService;

	@PostMapping(value = "/{zipFilePath}/parseZipFile/")
	public AppResponse calculatePremium(@PathVariable("zipFilePath") String zipFilePath) throws AppException {
		try {
			AppResponse appResponse = new AppResponse();
			iAppService.processXMLfromZipFile(zipFilePath);
			appResponse.setMessage(AppConstants.RESPONSE_STATUS_SUCCESS);
			appResponse.setResponseCode(AppConstants.RESPONSE_CODE_SUCCESS);
			return appResponse;
		} catch (Exception exception) {
			throw new AppException(AppErrorResponse.UNKNOWN_ERROR.getCode(), exception.getMessage(), exception);
		}
	}
}
