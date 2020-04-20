package com.syntax.class17;

public class Employee {
	
	public static String title;
	
	public String name; // accessible everywhere
	protected String lastName; // accessible within same package
	
	double salary; // accessible within same package
	
	private long ssn; //accessible within same class
	
	public  static void method1() {
		System.out.println("I am Public method");
	}
	
	protected void method2() {
		System.out.println("I am protected method");
	}
	
	void method3() {
		System.out.println("I am default method");
	}
	
	private void method4() {
		System.out.println("I am private method");
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Jonh";
		emp.lastName="Smith";
		emp.salary=90000;
		emp.ssn=123456789;
		
		method1(); //static
		emp.method1();
		emp.method2();
		emp.method3();
		emp.method4();
	}

}
