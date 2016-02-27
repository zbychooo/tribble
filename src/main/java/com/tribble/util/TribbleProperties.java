package com.tribble.util;

import java.io.IOException;
import java.util.Properties;

public class TribbleProperties {
	
	private TribbleProperties(){}
	
	private static final Properties PROPERTIES = new Properties();

	private static final String CONFIG_FILE_NAME = "config.properties";
	
	static {
		try {
			PROPERTIES.load(TribbleProperties.class.getClassLoader().getResourceAsStream(CONFIG_FILE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object getProperty(String key) {
		return PROPERTIES.get(key);
	}

}
