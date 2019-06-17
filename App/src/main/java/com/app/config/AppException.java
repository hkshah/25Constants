package com.app.config;

/**
 * Custom exception for the application
 *
 */
public class AppException extends Exception {

	private static final long serialVersionUID = 1085850970625175580L;

	private String errorCode;

	private String errorMessage;

	private Throwable error;

	/**
	 * Constructor with code and message
	 *
	 * @param errorCode
	 * @param errorMessage
	 */
	public AppException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	/**
	 * Constructor with code, message and exception object
	 *
	 * @param errorCode
	 * @param errorMessage
	 * @param error
	 */
	public AppException(String errorCode, String errorMessage, Throwable error) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.error = error;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Throwable getError() {
		return error;
	}

	public void setError(Throwable error) {
		this.error = error;
	}
}