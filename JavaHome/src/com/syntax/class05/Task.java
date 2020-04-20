package com.syntax.class05;

import java.util.Scanner;

public class Task {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your heigths");
		
		int heights=scan.nextInt();
		
		if (heights<=60) {
			System.out.println("You are short");
		}else if (heights>60 && heights<=72) {
			System.out.println("You are medium");
		}else {System.out.println("You are tall");
		
		}
		
	}

}
