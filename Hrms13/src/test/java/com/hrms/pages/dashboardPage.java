package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.DriverBase;

public class dashboardPage {
	
	@FindBy(xpath="//div[@id='branding']/a/img")
	public WebElement logo;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement EmployeeList;
	
	@FindBy(id="welcome")
	public WebElement welcom;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmployee;
	
	public dashboardPage() {
		PageFactory.initElements(DriverBase.driver, this);
	}

}
