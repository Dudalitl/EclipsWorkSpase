package com.selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.configuration.base;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		base.setUp();
		
		WebElement account=base.driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Thread.sleep(3000);
		
		Actions action=new Actions(base.driver);
		action.moveToElement(account).perform();
		
		action.contextClick().perform();
		

	}

}
