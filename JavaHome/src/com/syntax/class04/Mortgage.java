package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		
		double rate=4.2;
		int loan=29000;
		
		if (rate>4.5) {
			System.out.println("Will not buy house");
		}else {
			System.out.println("consider buying");
		 if (loan>20000) {
			 System.out.println("user will take a loan");
		}else {
			System.out.println("User will pay cash");
			}
		}

	}

}
