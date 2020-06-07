package com.selenium.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		
		for(int i=1;i<=3;i++) {
			driver.findElement(By.id("button1")).click();
			Thread.sleep(2000);
		}
		
		Set<String>allWindows=driver.getWindowHandles();
		
		for(String handle : allWindows) {
			System.out.println(handle);
			driver.switchTo().window(handle);
			driver.get("https://google.com");
			Thread.sleep(2000);
			driver.close();
		}

	}

}
