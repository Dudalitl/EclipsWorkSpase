package com.selenium.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBoxDemo2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");

		
		WebElement continent=driver.findElement(By.id("continentsmultiple"));
		
		Select select=new Select(continent);
		
		select.selectByValue("AUS");
		
		List<WebElement>optoinList=select.getOptions();
		Iterator<WebElement> it=optoinList.iterator();
		
		while(it.hasNext()) {
			String text=it.next().getText();
			System.out.println(text);
		}

	}

}
