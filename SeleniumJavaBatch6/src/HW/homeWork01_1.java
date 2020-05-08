package HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//TC 2: Opening Page on Firefox Browser
//Open Firefox browser
//Navigate to “https://www.redfin.com/”
//Verify that you have navigated to (https://www.redfin.com/)
//End the Session (close the browser).

public class homeWork01_1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redfin.com/");
		String verifyUrl="https://www.redfin.com/";
		String currentUrl=driver.getCurrentUrl();
		driver.close();
		if (currentUrl.equals(verifyUrl)) {
			System.out.println("URL is match to given");
		}else {
			System.out.println("URL is wrong");
		}
	}
}