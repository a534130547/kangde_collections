package com.atguigu.util;

import java.io.InputStream;
import java.util.Properties;

public class MyPropertyUtil {

	public static String getProperty(String pro, String key) {

		Properties properties = new Properties();

		InputStream resourceAsStream = MyPropertyUtil.class.getClassLoader().getResourceAsStream(pro);

		try {
			properties.load(resourceAsStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		String property = properties.getProperty(key);
		return property;

	}

}
