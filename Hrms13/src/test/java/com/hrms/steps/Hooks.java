package com.hrms.steps;

import com.hrms.utils.DriverBase;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void start() {
		DriverBase.setUp();
	}
	
	@After
	public void  end() {
		DriverBase.teerDown();
	}

}
