package com.syntax.class12;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		String momName;
		String dedName;
		String sex;
		int indexM, indexD;
		
		System.out.println("Please enter Mom's Name");
		momName=sc.nextLine();
		System.out.println("Please enter Ded's Name");
		dedName=sc.nextLine();
		System.out.println("Please enter boy or girl");
		sex=sc.nextLine();
		indexM=(momName.length())/2;
		indexD=(dedName.length())/2;
		
		System.out.println(indexM);
		System.out.println(indexD);
		
		
		
	}

}
