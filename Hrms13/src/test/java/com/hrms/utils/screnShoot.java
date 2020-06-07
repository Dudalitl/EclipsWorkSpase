package com.hrms.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class screnShoot extends DriverBase{
	
	public static void takeScrenshoot(String fileName) {
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sourceFile=ts.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(sourceFile, new File("screnShoot"+fileName+".jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
