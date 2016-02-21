package com.tribble.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TribbleProperties {
	
	private TribbleProperties(){}
	
	private static final Properties PROPERTIES = new Properties();
	
	//TODO: change the path!
	private static final String PATH = System.getProperty("user.dir") + "";
	
	static {
		try {
			PROPERTIES.load(new FileInputStream(new File(PATH)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object getProperty(String key) {
		return PROPERTIES.get(key);
	}

}
