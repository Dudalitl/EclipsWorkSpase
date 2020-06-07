package com.hrms.steps;

import com.hrms.utils.MainMethods;
import com.hrms.utils.infoReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginPageSteps extends MainMethods {


@When("User check logo is display")
public void user_check_logo_is_display() {
	   boolean logoDispl= login.logo.isDisplayed();
	   System.out.println(logoDispl);
}

@When("User put user name")
public void user_put_user_name() {
	sendText(login.username, infoReader.getKey("username"));
}

@When("User put wrong password")
public void user_put_wrong_password() {
	sendText(login.password, "123456789");
}

@When("User click button login")
public void user_click_button_login() {
	click(login.loginButton);
}

@Then("User see error message")
public void user_see_error_message() {
    String message=login.errorMsg.getText();
    System.out.println(message);
}

@When("User put valid password")
public void user_put_valid_password() {
	sendText(login.password, infoReader.getKey("password"));
}

@Then("User see welcom message")
public void user_see_welcom_message() {
	String messang=dashBoard.welcom.getText();
	System.out.println(messang);	
}
}
