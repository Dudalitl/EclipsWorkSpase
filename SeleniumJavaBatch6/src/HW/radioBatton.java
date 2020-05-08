package HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TC 4: Radio Buttons Practice  
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Input Forms” links
//Click on “Radio Buttons Demo” links
//Click on any radio button in “Radio Button Demo” section.
//Verify correct radio is clicked
//Click on any radio button in “Group Radio Buttons Demo” section.
//Verify correct checkbox is clicked
//Quit browser

public class radioBatton {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://jiravm.centralus.cloudapp.azure.com:8081/index.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		List<WebElement> butten=driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement ButtenM:butten) {
			//System.out.println(ButtenM.getAttribute("value"));
			
			if(ButtenM.getAttribute("value").equals("Male")) {
				ButtenM.click();
			}
		}
		
		
		//System.out.println(butten.size());
		
		
	}

}
