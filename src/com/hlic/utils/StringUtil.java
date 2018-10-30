package com.hlic.utils;

public class StringUtil {
	/** 判断对象的值是否为空 */
	public static boolean isNull(Object obj) {
		boolean flag = false;
		if (null == obj || "".equals(obj))
		flag = true;
		return flag;
	}
	/** 判断对象的值是否为空 */
	public static boolean isNotNull(Object obj) {
		boolean flag = true;
		if (null == obj || "".equals(obj))
		flag = false;
		return flag;
	}
}
