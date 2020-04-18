package com.java.reveiw;

public class Person {

		  String name, lastName;
		  int age;
		}
		class Employee extends Person {
		  int salary;
		  public void m1(String name, String lastName, int age, int salary) {
		    System.out.println(name+" "+lastName+" "+age+" "+salary);
		  }
		}
		class Student extends Person{
		  int grade;
		  public void m2(String name, String lastName, int age, int grade){
		    System.out.println(name+" "+lastName+" "+age+" "+grade);
		  }
		}
		class Retiree extends Person{
		  String seniorActivity;
		  public void m3(String name, String lastName, int age, String seniorActivity){
		  System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
		  }
		}