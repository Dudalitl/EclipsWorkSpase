package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//
//TC 1: Amazon Page Title Verification: 
//Open chrome browser
//Go to “https://www.amazon.com/”
//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed

public class homeWork01 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //command for open browser(Chrome)
		
		driver.get("https://www.amazon.com/"); //command for browser go to url
		
		driver.getTitle(); //command for get title from page
		
		String verifyTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		if (driver.getTitle().equalsIgnoreCase(verifyTitle)) {
			System.out.println("Title is true");
		}else {
			System.out.println("Title is wrong");
		}
		
		driver.close();
		
		

	}

}
