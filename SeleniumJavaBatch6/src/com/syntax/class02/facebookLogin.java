package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.e-zpassny.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("MY ACCOUNT")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("login")).sendKeys("dudalitl1388");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("password")).sendKeys("t1QNti39");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnLogin")).click();

	}

}
