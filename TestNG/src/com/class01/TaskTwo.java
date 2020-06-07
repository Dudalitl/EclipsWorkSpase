package com.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TaskTwo {
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	@BeforeMethod
	public void beforMethod() {
		System.out.println("beforMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
