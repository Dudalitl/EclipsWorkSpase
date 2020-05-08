package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practic {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		 
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Yuri");
		
		driver.findElement(By.name("lastName")).sendKeys("Shev");
		
		driver.findElement(By.name("phone")).sendKeys("3333333333");
		
		driver.findElement(By.id("userName")).sendKeys("fffff@asdf.com");
		
		
		
		
		
		
		
		
		
		
		

	}

}
