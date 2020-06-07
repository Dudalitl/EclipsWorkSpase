package HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://uitestpractice.com/Students/Select");
		
		WebElement dropDawn=driver.findElement(By.id("countriesSingle"));
		
		Select select=new Select(dropDawn);
		List<WebElement>ddElement=select.getOptions();
		for (WebElement element:ddElement) {
			if (element.getText().equals("United states of America")) {
				element.click();
				break;
			}
		}

	}

}
