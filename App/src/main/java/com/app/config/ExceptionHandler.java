package com.app.config;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.AppResponse;
import com.app.util.AppConstants;

@ControllerAdvice
public class ExceptionHandler {
	private static final Logger LOGGER = Logger.getLogger(ExceptionHandler.class);

	@org.springframework.web.bind.annotation.ExceptionHandler(AppException.class)
	public @ResponseBody AppResponse handleCustomException(final AppException AppException) {
		if (!StringUtils.isEmpty(AppException.getError())) {
			LOGGER.error(AppException.getErrorMessage(), AppException.getError());
		} else {
			LOGGER.error(AppException.getErrorMessage(), AppException);
		}
		AppResponse response = new AppResponse();
		response.setResponseCode(AppException.getErrorCode());
		response.setMessage(AppException.getErrorMessage());
		return response;
	}

	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public @ResponseBody AppResponse handleException(final Exception exception) {
		LOGGER.error(exception.getMessage(), exception);
		AppResponse response = new AppResponse();
		response.setResponseCode(AppConstants.RESPONSE_CODE_UNKNOWN);
		response.setMessage(exception.getMessage());
		return response;
	}
}