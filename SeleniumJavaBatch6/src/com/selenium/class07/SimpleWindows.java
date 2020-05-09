package com.selenium.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		
		String singUpTitle=driver.getTitle();
		System.out.println(singUpTitle);
		driver.findElement(By.linkText("Help")).click();
		
		driver.quit();		
	}

}
