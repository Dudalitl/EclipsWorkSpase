package com.selenium.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHAndle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/syntaxpractice/window-popup-modal-demo.html");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		String parentWindows=driver.getWindowHandle();
		System.out.println(parentWindows);
		
		
		
		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		Thread.sleep(2000);

		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> it=allWindows.iterator();
		
		while(it.hasNext()) {
			String handle=it.next();  //Grab next window
			//driver.switchTo().window(handle); //bad way just open all windows on circle
			if (!handle.equals(parentWindows)) { //switch to next windows if it not perent window
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(2000);
			}
			}
		driver.quit();
	}

}
