package com.selenium.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://uitestpractice.com/Students/Contact");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("This is a Ajax link")).click();
		
		boolean isDisplay= driver.findElement(By.xpath("//div[@class='ContactUs']")).isDisplayed();
		if(isDisplay) {
		String text=driver.findElement(By.xpath("//div[@class='ContactUs']")).getText();
		System.out.println(text);
		}else {System.out.println("text is not display");
		}
		driver.quit();

	}

}
