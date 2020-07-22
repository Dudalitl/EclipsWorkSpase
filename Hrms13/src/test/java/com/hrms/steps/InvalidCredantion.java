package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.MainMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class InvalidCredantion extends MainMethods {
	
	
	@When("I enter invalid username and password and see error message")
	public void I_enter_invalid_username_and_password(DataTable dataTable) {
		List<Map<String, String>> data=dataTable.asMaps();
		for(Map<String,String> ls:data) {
		sendText(login.username, ls.get("UserName"));
		sendText(login.password, ls.get("Password"));
		click(login.loginButton);
		Assert.assertEquals("Wrong", ls.get("ErrorMessage"), login.errorMsg.getText());
		}
	}

}
