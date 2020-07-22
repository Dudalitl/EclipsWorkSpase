package com.hrms.utils;

import com.hrms.pages.EmployeeListPage;
import com.hrms.pages.PersonlDetailPage;
import com.hrms.pages.addEmployeePage;
import com.hrms.pages.dashboardPage;
import com.hrms.pages.loginPage;

public class PageInitializer extends DriverBase {
	
	public static loginPage login;
	public static dashboardPage dashBoard;
	public static EmployeeListPage employeeList;
	public static addEmployeePage addEmployee;
	public static PersonlDetailPage personDetali;
	
	public static void initializer() {
		login=new loginPage();
		dashBoard=new dashboardPage();
		employeeList=new EmployeeListPage();
		addEmployee=new addEmployeePage();
		personDetali=new PersonlDetailPage();
	}

}
