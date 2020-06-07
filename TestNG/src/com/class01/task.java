package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.configuration.Base;





public class task extends Base {
	
	@BeforeMethod
	public void openBrowser() {
		setUp();
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		String name="Admin";
		String password="Hum@nhrm123";
		WebElement login=driver.findElement(By.id("txtUsername"));
		login.sendKeys(name);
		WebElement pasword=driver.findElement(By.id("txtPassword"));
		pasword.sendKeys(password);
		
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		
	}


}
