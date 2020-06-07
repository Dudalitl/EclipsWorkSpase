package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.selenium.configuration.InfoReader;
import com.selenium.configuration.SeleniumPath;
import com.syntax.pages.loginPage;

public class gjdgnjsdh extends SeleniumPath {

	@Test
	public void testOne () {
		setUp();
//		WebElement name=driver.findElement(By.id("txtUsername"));
//		WebElement password=driver.findElement(By.id("txtPassword"));
//		WebElement Button=driver.findElement(By.id("btnLogin"));
//		SeleniumPath.ClickB(Button);
//		sendText(name, getKey("username"));
//		sendText(password, getKey("password"));
		
		loginPage login=new loginPage();
		sendText(login.username, "Admin");
		

		
		
		
	}
	
}
