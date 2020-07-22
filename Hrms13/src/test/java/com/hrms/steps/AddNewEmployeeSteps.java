package com.hrms.steps;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.testng.AssertJUnit;

import com.hrms.utils.ExelUtil;
import com.hrms.utils.MainMethods;
import com.hrms.utils.excelQW;
import com.hrms.utils.infoReader;
import com.testbase.Constans;

import io.cucumber.datatable.DataTable;
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
		wait(2);
		JSclick(dashBoard.addEmployee);
	}

	@When("user enter employee firstName, lastName")
	public void user_complet_First_Name_and_Last_Name(String fName, String lName) {
		sendText(addEmployee.firstName, "fName");
		wait(2);
		sendText(addEmployee.lastName, "lName");
		wait(2);
	}

	@When("user click save button")
	public void click_save_button() {
		click(addEmployee.saveButton);
		wait(5);
	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully(String expectName) {
		String actualName = personDetali.profPicName.getText();
		AssertJUnit.assertEquals(expectName, actualName);

//
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
	
	
	
	@When("user enter employee {string}, {string}")
	public void user_enter_employee(String fName, String lName) {
		sendText(addEmployee.firstName, "fName");
		wait(2);
		sendText(addEmployee.lastName, "lName");
		wait(2);
	}

	@Then("{string}, {string} is added successfully")
	public void is_added_successfully(String fName, String lName) {
	    String expecName=fName+" "+lName;
	    String actualName=personDetali.profPicName.getText();
	    Assert.assertEquals(expecName, actualName);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("user enters employee detalis and click save")
	public void user_enters_employee_detalis_and_click_save(DataTable dataTable) {
		List<Map<String, String>> addEmplo=dataTable.asMaps();
		
		for (Map<String, String> map:addEmplo) {
			sendText(addEmployee.firstName, map.get("FirstName"));
			sendText(addEmployee.lastName, map.get("LastName"));
			String fName=map.get("FirstName");
			String lName=map.get("LastName");
			
			click(addEmployee.saveButton);
		    String expecName=(fName)+" "+(lName);
		    String actualName=personDetali.profPicName.getText();
		    System.out.println(expecName);
		    System.out.println(actualName);
		   
		    
		    assertEquals(actualName, expecName);
		    
		    click(dashBoard.addEmployee);
		    wait(5);
		}
	}
		@When("user add new employee")
		public void user_add_new_employee() {

			
			List<Map<String, String>> excelList = excelQW.excelIntoListOfMaps(Constans.EXCEL_PATH, "321");

			for (Map<String, String> data : excelList) {
				String fname = data.get("FirstName");

				
				System.out.println(fname);
		}
		}

	

}
