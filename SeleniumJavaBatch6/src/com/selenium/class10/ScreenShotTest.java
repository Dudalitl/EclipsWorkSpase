package com.selenium.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import selenium.configuration.base;

public class ScreenShotTest extends base{
	
	public static void main(String[] args) throws IOException {
		
		setUp();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sourceFile, new File("screenshot/HRMS/dash.jpg"));
		
		driver.quit();
		
		
	}

}
