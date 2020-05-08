package com.selenium.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");

		
		WebElement multiSelect=driver.findElement(By.id("continentsmultiple"));
		
		Select select=new Select(multiSelect);
		boolean isMulti=select.isMultiple();
		System.out.println(isMulti);
		if(isMulti) {
			select.selectByIndex(0);
			select.selectByVisibleText("Australia");
			Thread.sleep(5000);
			select.deselectByValue("AS");
		}
	}

}
