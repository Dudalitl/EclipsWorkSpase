package com.selenium.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-elements-loading.html");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='startButton']")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver,20);
																				 //h4[contains(text(),'Welcome Syntax Technologies')]
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]")));
		
		String text=driver.findElement(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]")).getText();
		System.out.println(text);
		
		driver.quit();
		

	}

}
