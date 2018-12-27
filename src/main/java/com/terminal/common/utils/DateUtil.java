package com.terminal.common.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
	public static String getCurrentDateTimeString() {
		return DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());
	}

	public static String getDateTime(String pattern) {
		return DateTimeFormatter.ofPattern(pattern).format(LocalDateTime.now());
	}
}
