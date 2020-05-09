package com.syntax.class06;

import java.util.Scanner;

public class Calclator {
	public static void main(String[] args) {
		
		Scanner scan;
		double num1, num2, answer=0.0;
		char matOp;
		
		scan=new Scanner(System.in);
		
		
		System.out.println("Please enter first number");
		num1=scan.nextDouble();
		System.out.println("Please enter math operation");
		matOp=scan.next().charAt(0);
		System.out.println("Please enter second number");
		num2=scan.nextDouble();
		
		
		switch (matOp) {
		case '+':
			answer=num1+num2;
			break;
		case '-':
			answer=num1-num2;
			break;
		case '/':
			answer=num1/num2;
			break;
		case '*':
			answer=num1*num2;
			break;
			default:
			System.out.println("You used wrong operator please take one from this( + - / * )");
			
		}
		System.out.println(num1+""+matOp+""+num2+"="+answer);
		
		
	}

}
