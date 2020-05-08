package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMSLogin {
	
//	TC 1: HRMS Application Login: 
//		Open chrome browser
//		Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//		Enter valid username and password
//		Click on login button
//		Then verify Syntax Logo is displayed.

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(3000);
		
		Boolean logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']")).isDisplayed();
		
		if(!logo) {
			System.out.println("Logo is not Displayed");
		}else {System.out.println("Logo is Displayed");
		
		}
		//driver.quit();
			

	}

}
