package com.hrms.steps;



import com.hrms.utils.MainMethods;
import com.hrms.utils.infoReader;
import com.hrms.utils.screnShoot;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewEmployeeSteps extends MainMethods {
	@Given("User is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username, infoReader.getKey("username"));
		sendText(login.password, infoReader.getKey("password"));
		click(login.loginButton);
	}

	@Given("User navigate to Add Employee")
	public void user_navigate_to_Add_Employee() {
		JSclick(dashBoard.PIM);
		wait(3);
		JSclick(dashBoard.addEmployee);	
	}

	@When("User complet Full Name")
	public void user_complet_Full_Name() {
		sendText(addEmployee.firstName, "Yuri");
		wait(3);
		sendText(addEmployee.lastName, "Shev");
		wait(3);
	}

	@When("Click save button")
	public void click_save_button() {
		click(addEmployee.saveButton);
		wait(5);
	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
		screnShoot.takeScrenshoot("first");
	}

	@When("User deletes employee id")
	public void user_deletes_employee_id() {
		addEmployee.employeeId.clear();
		wait(3);
	}

	@When("User clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		click(addEmployee.LoginDetails);
		wait(3);
	}

	@When("User add login credentials")
	public void user_add_login_credentials() {
		sendText(addEmployee.userName, "yuri123");
		wait(3);
		sendText(addEmployee.userPassword, "Hum@nhrm123");
		wait(3);
		sendText(addEmployee.confirmPassword, "Hum@nhrm123");
		wait(3);
	}


}
