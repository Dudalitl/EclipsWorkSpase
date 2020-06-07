package com.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener {
	
	public void onTestStatr(ITestResult result) {
		System.out.println("Test starts"+ result.getName());
		}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed"+ result.getName());
		}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed"+ result.getName());
		}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped"+ result.getName());    
		  }
}
