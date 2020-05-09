package com.syntax.class08;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		String answer;
		Scanner sc;
		
		sc=new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {
			System.out.println("Do you want to apply credit");
			answer=sc.nextLine();
			if (answer.equals("yes")) {
				break;
			}
		}System.out.println("Your creadid applyed");

	}

}
