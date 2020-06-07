package com.selenium.configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class InfoReader {
	public static Properties prop;
	
	public static void reader(String FilePath) {
		try {
			FileInputStream fis=new FileInputStream(FilePath);
			prop=new Properties();
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getKey (String key) {
		return prop.getProperty(key);
	}

}
