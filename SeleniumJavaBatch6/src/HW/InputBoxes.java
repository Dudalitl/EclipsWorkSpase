package HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 3: Syntax Demo input boxes count: 
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Simple Form Demo” links
//Get all input boxes from the page
//Enter “Hello” to each text box
//Close browser


public class InputBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
	
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Input Forms")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Simple Form Demo")).click();
		Thread.sleep(2000);
		
		List<WebElement> boxes=driver.findElements(By.cssSelector("input[type='text']"));
		
		for(WebElement box:boxes) {
			box.sendKeys("Hello");
			Thread.sleep(2000);
		}
		
		driver.quit();
		

	}

}
