package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class AccesseTest {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Bill";
		//emp.lastName="Green";not available because protected
		//emp.salary=999999; not available because default

		emp.method1();
		//emp.method2();
		
	}

}
