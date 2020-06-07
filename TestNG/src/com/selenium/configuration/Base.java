package com.selenium.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base extends InfoReader {

	public static WebDriver driver;
	
	public static WebDriver setUp() {
		InfoReader.reader(Constants.Info_Path);
		switch (InfoReader.getKey("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.Chrome_Path);
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.Firefox_Path);
			driver=new FirefoxDriver();
			break;
			default:
				 throw new RuntimeException("Browser not found");
				}
		driver.get(InfoReader.getKey("url"));
				return driver;
		
	}
}
