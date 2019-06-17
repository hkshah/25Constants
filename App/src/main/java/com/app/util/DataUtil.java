package com.app.util;

import org.springframework.util.StringUtils;

public class DataUtil {

	public static Boolean isDataContains(Object field) {
		Boolean valid = false;
		if (field != null) {
			String fieldValue = field.toString();
			if (!StringUtils.isEmpty(fieldValue)) {
				valid = true;
			}
		}
		return valid;
	}
}