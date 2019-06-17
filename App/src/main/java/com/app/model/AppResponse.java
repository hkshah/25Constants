package com.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Class to represent base response
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppResponse implements Serializable {

	private static final long serialVersionUID = -452712180841058644L;

	private String responseCode;
	private List<String> messageList;
	private Object data;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public List<String> getMessage() {
		return messageList;
	}

	public void setMessage(String message) {
		if ((messageList == null) || messageList.isEmpty()) {
			messageList = new ArrayList<>();
		}
		messageList.add(message);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}