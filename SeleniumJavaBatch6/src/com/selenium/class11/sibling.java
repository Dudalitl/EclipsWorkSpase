package com.selenium.class11;

import org.openqa.selenium.By;

import selenium.configuration.base;

public class sibling extends base {

	public static void main(String[] args) {
		
		setUp();
		//folowing for parents class;
		driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		
		//
		

	}

}
