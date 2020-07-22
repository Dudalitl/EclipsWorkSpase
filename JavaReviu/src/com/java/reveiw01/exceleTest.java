package com.java.reveiw01;

import java.util.List;
import java.util.Map;

public class exceleTest {
	public static void main(String [] args) {
		
		
		List<Map<String, String>> data=excel.excelIntoListOfMaps("C:\\Users\\Yuri\\eclipse-workspace13\\JavaReviu\\dfg\\usersinfo.xls", "123");
		
		for(Map<String, String> qwer:data) {
			String name=qwer.get("FirstName");
			System.out.println(name);
		}
	}

}
