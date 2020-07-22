package com.hrms.API.steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import org.junit.Test;

public class HardcodeExample {

	/**
	 * Rest Assurt given - prepare you request when - you are making the call to the
	 * endpoint then - validation
	 * 
	 * @param args
	 */
	
	
	static String baseURI =RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUxOTQzMDYsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTIzNzUwNiwidXNlcklkIjoiNjkwIn0.rLyjZmeKQFdPu_MDuQCozQlPbNBUo8VEGsc0LJVzBMA";

public void sampleTestNotes() {
	/**
	 * Preparing getOneEmployee.php request
	 */
	RequestSpecification getOneEmployee = given().header("Content-Type", "application/json")
			.header("Authorization", token).queryParam("employee_id", "18991A").log().all();

	/**
	 * storing response
	 */
	Response getOneEmplResp = getOneEmployee.when().get("/getOneEmployee.php");

	/**
	 * Printing response
	 */
	// first way print result
	getOneEmplResp.prettyPrint();
	// second way print result
	String response = getOneEmplResp.body().asString();
	System.out.println(response);
	/**
	 * verifying response
	 */
	getOneEmplResp.then().assertThat().statusCode(200);
}

@Test
public void  aPostCreateEmployee() {
	RequestSpecification createEmpolyee = given().header("Content-Type", "application/json")
			.header("Authorization", token).body("{\r\n" + 
					"  \"emp_firstname\": \"Yuri\",\r\n" + 
					"  \"emp_lastname\": \"Boss\",\r\n" + 
					"  \"emp_middle_name\": \"\",\r\n" + 
					"  \"emp_gender\": \"M\",\r\n" + 
					"  \"emp_birthday\": \"1988-07-12\",\r\n" + 
					"  \"emp_status\": \"Employee\",\r\n" + 
					"  \"emp_job_title\": \"Chief Financial Officer\"\r\n" + 
					"}");
	
	Response createEmpolyeeResp=createEmpolyee .when().post("/createEmployee.php");
	
	createEmpolyeeResp.prettyPrint();
	
	
}

}
