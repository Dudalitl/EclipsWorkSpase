package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.DriverBase;

public class loginPage {
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginButton;
	
	@FindBy(xpath="//div[@id='divLogo']//img")
	public WebElement logo;
	
	public loginPage() {
		PageFactory.initElements(DriverBase.driver, this);
	}
	

}
