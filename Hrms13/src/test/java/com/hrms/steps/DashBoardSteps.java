package com.hrms.steps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import com.hrms.utils.MainMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DashBoardSteps extends MainMethods {
	
	@Then("user see dashboard menuis is displayed")
	public void user_see_dashboard_menuis_is_displayed(DataTable dataTable) {
		List<String>expectedMenu=dataTable.asList();
		List<String> lt=new ArrayList<>();
		
		for(WebElement menu:dashBoard.menu) {
			lt.add(menu.getText());
			
		}
		System.out.println(expectedMenu);
		System.out.println(lt);
		
	}
	

}
