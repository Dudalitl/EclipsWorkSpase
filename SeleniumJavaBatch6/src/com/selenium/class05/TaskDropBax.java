package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskDropBax {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		WebElement month=driver.findElement(By.id("month"));

		Select selectM=new Select(month);
		
		selectM.selectByVisibleText("Mar");
		
		WebElement day=driver.findElement(By.id("day"));
		
		Select selectD=new Select(day);
		
		selectD.selectByVisibleText("13");
		
		WebElement year=driver.findElement(By.id("year"));
		
		Select selectY=new Select(year);
		
		selectY.selectByVisibleText("1988");
		
		
			
		
		
	}

}
