package HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownButten {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://uitestpractice.com/Students/Select");
		
		//driver.findElement(By.id("dropdownMenu1")).click();
		WebElement ddButton=driver.findElement(By.id("dropdownMenu1"));
		Select obj=new Select(ddButton);
		List<WebElement>ddelement=obj.getOptions();
		for(WebElement element:ddelement) {
			if (element.getText().equals("United states of America")) {
				element.click();
				break;
			}
		}

	}

}
