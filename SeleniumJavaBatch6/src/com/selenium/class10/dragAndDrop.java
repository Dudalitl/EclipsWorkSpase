package com.selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.configuration.base;

public class dragAndDrop extends base{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(drag).moveToElement(drop).release().perform();
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		action.dragAndDrop(drag, drop).perform();
		
		

	}

}
