package com.selenium.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploade {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("File Upload")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("file-upload")).click();
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Yuri\\eclipse-workspace13\\SeleniumJavaBatch6\\screenshot\\HRMS\\dash.jpg");
		
		driver.findElement(By.id("file-submit")).click();

	}

}
