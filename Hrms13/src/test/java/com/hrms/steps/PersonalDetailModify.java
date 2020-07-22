package com.hrms.steps;

import com.hrms.utils.MainMethods;
import com.hrms.utils.infoReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalDetailModify extends MainMethods {
//	@Given("User is logged with valid admin credentials")
//	public void user_is_logged_with_valid_admin_credentials() {
//		sendText(login.username, infoReader.getKey("username"));
//		sendText(login.password, infoReader.getKey("password"));
//		click(login.loginButton);
//	}
//
//	@Given("User navigate to Add Employee")
//	public void user_navigate_to_Add_Employee() {
//		JSclick(dashBoard.PIM);
//		wait(2);
//		JSclick(dashBoard.addEmployee);
//	}
	
	@When("User enter {string} and {string}")
	public void user_enter_and(String fName, String lName) {
		fName="oleg";
		lName="boss";
		sendText(addEmployee.firstName, fName);
		sendText(addEmployee.lastName, lName);
	    
	}

	@When("User click creat personal detail")
	public void user_click_creat_personal_detail() {
		click(addEmployee.LoginDetails);
	}

	@When("User comlet login, password")
	public void user_comlet_login_password() {
		sendText(addEmployee.userName, "OlegCro");
		sendText(addEmployee.userPassword, "Hum@nhrm123");
		sendText(addEmployee.confirmPassword, "Hum@nhrm123");
	}

	@When("User click save button")
	public void user_click_save_button() {
		click(addEmployee.saveButton);
		wait(5);
	}

	@Then("User click on button edit")
	public void user_click_on_button_edit() {
		click(personDetali.editSave);
		wait(5);
	}

	@Then("User add Driver licens")
	public void user_add_Driver_licens() {
		sendText(personDetali.LicenNo, "123654789");
		wait(5);
	}

	@Then("User add License Expiry Date")
	public void user_add_License_Expiry_Date() {

	}

	@Then("User add SSN Number")
	public void user_add_SSN_Number() {
		sendText(personDetali.SSN, "4123-65-89");
	}

	@Then("User add SIN Number")
	public void user_add_SIN_Number() {
		sendText(personDetali.SIN, "15935728");
	}

	@Then("User add Gender")
	public void user_add_Gender() {
		clickRadioOrCheckBox(personDetali.Gender, "1");
	}

	@Then("User add Marital Status")
	public void user_add_Marital_Status() {
		DropBox(personDetali.MarigStatus, "Married");
	}

	@Then("User add Nationality")
	public void user_add_Nationality() {
		DropBox(personDetali.Nationality, "Russian");
	}

//	@Then("User add Date of Birth")
//	public void user_add_Date_of_Birth() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("User add Nick Name")
	public void user_add_Nick_Name() {
		sendText(personDetali.NickName, "olegush");
	}

	@Then("User add Smoker")
	public void user_add_Smoker() {
		click(personDetali.SmokChekBox);
	}

	@Then("User add Military Service")
	public void user_add_Military_Service() {
		sendText(personDetali.Military, "not");
	}

	@Then("User click on button save")
	public void user_click_on_button_save() {
		click(personDetali.editSave);
	}
	
	
	
}