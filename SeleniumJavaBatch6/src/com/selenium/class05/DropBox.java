package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/basic-select-dropdown-demo.html");
		
		
		WebElement weekDD =driver.findElement(By.id("select-demo"));
		
		Select select=new Select(weekDD);
		
		
		//1 way
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		//select.selectByIndex(3);
		for(int i=0;i<options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
		}
		
		
		//2 way
		
		select.selectByVisibleText("Friday");
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		
		
		
	}

	private static void tearDown() {
		// TODO Auto-generated method stub
		
	}



	

}
