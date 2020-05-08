package com.selenium.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//button[@id='alert']")).click();
		driver.findElement(By.id("alert")).click();
		Alert simplAlert=driver.switchTo().alert();
		String alertText=simplAlert.getText();
		System.out.println(alertText);
		Thread.sleep(3000);
		simplAlert.accept();
		////////////////////////////////////////////////
		Thread.sleep(3000);
		driver.findElement(By.id("confirm")).click();;
		
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		String confirmText=confirmAlert.getText();
		System.out.println(confirmText);
		confirmAlert.dismiss();
		
		////////////////////////////////////////////////
		
		
		
		
		
	}

}
