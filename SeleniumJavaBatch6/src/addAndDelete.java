import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.selenium.syntax.utilite.Constants;


public class addAndDelete {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");	
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		
		driver.findElement(By.id("calFromDate")).clear();
		
		WebElement Data=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select select=new Select(Data);
		select.selectByVisibleText("Mar");
		
		
		
		
		

	}

}
