package class04;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.configuration.Constants;
import com.selenium.configuration.SeleniumPath;

public class HW extends SeleniumPath {
	
	@Test(dataProvider ="userData")
	public void test (String firstName, String lastName, String userName, String employID) throws InterruptedException {
		setUp();
		sendText(driver.findElement(By.id("txtUsername")), getKey("username"));
		sendText(driver.findElement(By.id("txtPassword")), getKey("password"));
		Click(driver.findElement(By.id("btnLogin")));
		Thread.sleep(5000);
		Click(driver.findElement(By.id("menu_pim_viewPimModule")));
		Click(driver.findElement(By.id("menu_pim_addEmployee")));
		
	}
	@DataProvider(name="userData")
	public Object[] [] getData() {
		Object[] [] data= {
				{"YUri", "tram","Yrtr","1234"}
		
		};
		return data;
		
	}

}
