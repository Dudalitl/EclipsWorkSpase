package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBoxDemo {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form/");

		
		WebElement continent=driver.findElement(By.id("continents"));
		
		Select select=new Select(continent);
		
		List<WebElement> options= select.getOptions();
		
		for(WebElement option:options) {
			String text=option.getText();
			System.out.println(text);
			
			if (text.equals("Africa")) {
				option.click();
				String ddtext=option.getText();
				Thread.sleep(3000);
				if (ddtext.equals("Africa")) {
					System.out.println("continent is true"+ option.isSelected());
				}
				//select.selectByVisibleText("Asia");
				
			}
		}
		Boolean ismultipal=select.isMultiple();	
		System.out.println(ismultipal);
		
		
			driver.quit();
		
		
		
		
	}

}
