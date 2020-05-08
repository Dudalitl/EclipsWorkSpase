package com.selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/bootstrap-iframe.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("FrameOne");
		boolean logo=driver.findElement(By.id("hide")).isDisplayed();

				System.out.println(logo);
				driver.switchTo().defaultContent();
				
				driver.switchTo().frame("FrameTwo");
				boolean lago=driver.findElement(By.xpath("//img[@alt='Syntax Technologies']")).isDisplayed();
				
				System.out.println(lago);
	}

}
