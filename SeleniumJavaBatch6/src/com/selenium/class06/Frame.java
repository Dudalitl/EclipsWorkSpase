package com.selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//////////////////////////////////////////////
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();

		System.out.println(text);
		
		driver.switchTo().frame(0);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("name");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		///////////////////////////////////////
		
		driver.switchTo().frame("iframe_a");
		name.clear();
		name.sendKeys("noName");
		Thread.sleep(3000);
		
		////////////////////////////////////
		
		driver.switchTo().defaultContent();
		WebElement frame=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(frame);
		name.clear();
		name.sendKeys("test");
		driver.switchTo().defaultContent();
	}

}
