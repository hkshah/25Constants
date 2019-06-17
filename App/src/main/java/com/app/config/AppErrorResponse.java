package com.app.config;

public enum AppErrorResponse {

	UNKNOWN_ERROR("App00001", "Unknown Error");

	private String code;
	private String message;

	private AppErrorResponse(final String code, final String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
