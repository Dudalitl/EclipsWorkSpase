package com.hrms.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class infoReader {
	
	public static Properties prop;
	
	public static void reader(String filePATH) {
		try {
			FileInputStream fis =new FileInputStream(filePATH);
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
	
	public static String getKey(String key) {
		return prop.getProperty(key);
	}

}
