package com.selenium.configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumPath extends Base {
	
	
	public static void Click(WebElement element) {
		element.click();
	}
	
	public static void sendText (WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	
	

}
