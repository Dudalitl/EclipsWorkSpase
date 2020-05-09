package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		String filePath="C:\\Users\\Yuri\\eclipse-workspace13\\JavaHome\\configs\\examples.properties";

		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		prop.setProperty("PhoneNumber", "123456789");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		prop.store(fos, "add");
		
		
	}

}
