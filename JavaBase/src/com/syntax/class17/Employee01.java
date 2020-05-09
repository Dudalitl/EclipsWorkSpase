package com.syntax.class17;

public class Employee01 {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Yuri";
		emp.lastName="Shev";
		emp.salary=100000;
		//emp.ssn=987654321; not avalible because private
		
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4(); not avalible because private 
	}

}
