package com.syntax.class06;

import java.util.Scanner;
public class UserGraduet {

	public static void main(String[] args) {
		
		
		Scanner scan;
		String grad;
		String expl;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		grad=scan.nextLine();
		
		switch (grad.toLowerCase()) {
		
		case "a":
			expl="Exellent";
			break;
		case "b":
			expl="Good";
			break;
		case "c":
			expl="Average";
			break;
		case "d":
			expl="Bad";
			break;
			default:
			expl="Not Acceptable";
		}
		System.out.println("Your grade is "+ expl);
	}

}
