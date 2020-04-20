package com.syntax.class01;

public class VariableDeclaration {
    public static void main(String[] args) {
		// creat a variable and store value
		//1. declaring a varible and assigning a value
		boolean b=true;

		// 2. way: 1 step --> declare variable
		//         2 step --> assign variable
		
		int i;
		i=1000;
		
		//declare multiple variables and assign value later
		
		char a,x,z;
		a='A';
		x='#';
		z='7';
		
		//we cannot have variables with same name in 1 program
		//double i=12.99-->java will complain
		double i1=12.99;
		
		z='$'; // reassining the value
		i=2000;
		
		System.out.println(i);
		
		int num=100;
		int num1=100;
		
		System.out.println(z);
		
	}

}
