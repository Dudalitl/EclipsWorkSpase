package com.syntax.class34;

//Create a method to check age eligibility that will throw a runtime exception.
//Method should throw an exception age is less than 16.

public class Task34 {

	
//		int age;
//		String name;
		public static void m1(int age) {
			
			if(age<16) {
				throw new RuntimeException("age less than 16");
			
			}else {System.out.println(age);
			}
			}
		
		
//		Create a method checkUserName that will throw a runtime exception.
//		Method should throw an exception when entered username is less than 5 characters.
		
		public static void  checkUserName (String name) {
			int size=name.length();
			if (size<=5) {
				throw new RuntimeException("Name shot be long 5 characters");
			}else {System.out.println(name);
			
			}
			
		}
			
		
		
		public static void main(String[] args) {
			
			Task34 obj= new Task34();
			obj.m1(17);
			m1(19);
			checkUserName("yuriqwe");
			
	
		
	}

}
