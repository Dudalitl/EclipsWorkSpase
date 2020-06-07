package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.DriverBase;

public class EmployeeListPage {
	
	@FindBy (id="empsearch_employee_name_empName")
	public WebElement EmployeeName;
	
	@FindBy (id="empsearch_id")
	public WebElement EmployeeId;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	public EmployeeListPage() {
		PageFactory.initElements(DriverBase.driver, this);
	}

}
