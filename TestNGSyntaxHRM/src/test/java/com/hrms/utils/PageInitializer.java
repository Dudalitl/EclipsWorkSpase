package com.hrms.utils;

import com.hrms.pages.loginPage;

public class PageInitializer extends DriverBase {
	
	public static loginPage login;
	
	public static void initializer() {
		login=new loginPage();
	}

}
