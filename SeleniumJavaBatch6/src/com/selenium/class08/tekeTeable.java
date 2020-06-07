package com.selenium.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tekeTeable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		
		WebElement table=driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']"));
		List<WebElement> row=table.findElements(By.tagName("tr"));
		
		for(WebElement colm:row) {
			
			System.out.println(colm.getText());
			
		}
			
		System.out.println(row.size());
		
		
		
		
		
		

	}

}
