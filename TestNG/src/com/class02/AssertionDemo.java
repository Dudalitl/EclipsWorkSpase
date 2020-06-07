package com.class02;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.selenium.configuration.SeleniumPath;

public class AssertionDemo  extends SeleniumPath{
	
	@BeforeMethod
	public  void Befor() {
		setUp();
		
	}

	@AfterMethod
	public  void After() {
		driver.quit();
		
	}
	
	@Test   
	public void test() {
		String expectedTitle="Human Management System!!!";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
}
