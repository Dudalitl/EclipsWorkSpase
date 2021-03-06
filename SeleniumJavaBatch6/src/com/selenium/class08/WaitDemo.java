package com.selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement goneText=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
		String text=goneText.getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
		WebElement tText= wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
		System.out.println(tText.getText());
		
		
		
		
		

	}

}
