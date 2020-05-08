package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
	
		
		String filePath="C:\\Users\\Yuri\\eclipse-workspace13\\JavaHome\\configs\\examples.properties";

		FileInputStream fileImput=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fileImput);	
		
		prop.getProperty("name");
		
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		
		Set<Object>keys=prop.keySet();
		
		System.out.println(keys);
		
		System.out.println(prop);
	}

}
