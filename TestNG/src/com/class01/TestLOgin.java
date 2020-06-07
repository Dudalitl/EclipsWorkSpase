package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.selenium.configuration.SeleniumPath;

public class TestLOgin extends SeleniumPath {
	
	@BeforeMethod
	public static void beforTest() {
		setUp();
	}
	
	@Test
	public static void test1() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public static void test2() {
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		boolean display=logo.isDisplayed();
		System.out.println(display);
	}
	
	@Test
	public static void test3() {
		WebElement login=driver.findElement(By.id("txtUsername"));
		WebElement password=driver.findElement(By.id("txtPassword"));
		WebElement button=driver.findElement(By.id("btnLogin"));
		sendText(login, getKey("username"));
		sendText(password, getKey("password"));
		Click(button);
	}
	
	@AfterMethod
	public static void afterTest() {
		driver.quit();
	}


}
