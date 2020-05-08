package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//TC 2: HRMS Application Negative Login: 
//Open chrome browser
//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
//Enter valid username
//Leave password field empty
//Verify error message with text “Password cannot be empty” is displayed.


public class NegativLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		Thread.sleep(3000);
		
		String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		
		if (!message.equalsIgnoreCase("Password cannot be empty")) {
			System.out.println("Wrong message");
		}else {System.out.println("Message is correct");
		
		}
		
		driver.quit();
		

	}
}
