package com.terminal.common.utils;

/**
 * 字符串工具类
 * 
 * @author mlbaby
 *
 */
public class StringUtil {
	/**
	 * 判断一个字符串是否为null或""
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isEmpty(String value) {
		if (null == value || value.trim().equals("")) {
			return true;
		}
		return false;
	}

	/**
	 * 判断一组字符串中是否有null或""
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isEmptyOne(String... value) {
		if (null == value || value.length == 0) {
			return true;
		}
		for (String val : value) {
			if (isEmpty(val)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 判断一组字符串是否全部为null或""
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isEmptyAll(String... value) {
		boolean result = true;
		if (null != value && value.length > 0) {
			for (String val : value) {
				if (!isEmpty(val)) {
					result = false;
				}
			}
		}
		return result;
	}
}
