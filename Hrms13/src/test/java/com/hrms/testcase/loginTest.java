package com.hrms.testcase;

import org.testng.annotations.Test;
import com.hrms.utils.MainMethods;
import com.hrms.utils.infoReader;


public class loginTest extends MainMethods {
	
	@Test
	public void testOne() {
	sendText(login.username,  infoReader.getKey("username"));
	wait(3);
	sendText(login.password, infoReader.getKey("password"));
	wait(3);
	click(login.loginButton);
	
	teerDown();
	
	}
}
