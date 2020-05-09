package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Print your age");
		int age=scan.nextInt();
		
		if (age>=0 && age<=3) {
			System.out.println("You are baby");
		}else if (age>3 && age<=5) {
			System.out.println("You are kid");
		}else if (age>5 && age<=12) {
			System.out.println("You are child");
		}else if (age>12 && age<=19) {
			System.out.println("You are teenager");
		}else if (age>19 && age<=64) {
			System.out.println("You are adult ");
		}else {System.out.println("You are senior ");
		
		}

	}

}
