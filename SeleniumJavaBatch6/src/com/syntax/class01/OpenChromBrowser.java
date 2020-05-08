package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String url=driver.getCurrentUrl();
		String urlTest="https://www.facebook.com/";
		
		if (url.equalsIgnoreCase(urlTest)) {
			String title=driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong url is returned");
		}
		System.out.println(url);
		
		
		
		
		driver.close();	}

}
