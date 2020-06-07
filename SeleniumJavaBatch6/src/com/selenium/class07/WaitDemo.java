package com.selenium.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		boolean isHomeDisplay =driver.findElement(By.xpath("//img[@id='hide']")).isDisplayed();
		
		System.out.println("logo is displayed? "+isHomeDisplay);
		
		
		driver.quit();


	}

}
