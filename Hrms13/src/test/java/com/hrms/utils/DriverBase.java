package com.hrms.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.testbase.Constans;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverBase {
	
	public static WebDriver driver;
	
	//@BeforeMethod(alwaysRun = true) // to make this method run before every @Test method
	public static WebDriver setUp() {
		infoReader.reader(Constans.INFO_PATH);
		
		switch (infoReader.getKey("browser").toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser not founded");	
		}
		//driver.manage().window().fullscreen();
		 driver.get(infoReader.getKey("url"));
		 PageInitializer.initializer();
		 return driver;
	}
	
	public static void teerDown() {
		if (driver!=null) {
			driver.quit();
		}
	}

}
