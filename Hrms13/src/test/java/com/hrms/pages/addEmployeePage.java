package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.DriverBase;

public class addEmployeePage {
	
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy(id="employeeId")
	public WebElement employeeId;
	
	@FindBy(id="chkLogin")
	public WebElement LoginDetails;
	
	@FindBy(id="user_name")
	public WebElement userName;
	
	@FindBy(id="user_password")
	public WebElement userPassword;
	
	@FindBy(id="re_password")
	public WebElement confirmPassword;
	
	@FindBy(id="btnSave")
	public WebElement saveButton;
	
	public addEmployeePage() {
		PageFactory.initElements(DriverBase.driver, this);
	}
	

}
