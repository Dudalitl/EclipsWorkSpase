package com.hrms.steps;

import com.hrms.utils.MainMethods;
import com.hrms.utils.infoReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EMployeeSearchSteps extends MainMethods {


	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username, infoReader.getKey("username"));
		sendText(login.password, infoReader.getKey("password"));
		click(login.loginButton);
	   
	}

	@Given("navigate to employee list page")
	public void navigate_to_employee_list_page() {
		click(dashBoard.PIM);
		click(dashBoard.EmployeeList);  
	}

	@When("user enter employee id")
	public void user_enter_employee_id() {
		sendText(employeeList.EmployeeId, "10080");
	}

	@When("click on search button")
	public void click_on_search_button() {
		click(employeeList.searchBtn);
	}
	


	
}
