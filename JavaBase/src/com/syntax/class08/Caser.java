package com.syntax.class08;

import java.util.Scanner;

public class Caser {

	public static void main(String[] args) {
	
		int item, price, summ, chang, money, moneq=0;
		Scanner sc;
		
		sc=new Scanner(System.in);
		
		System.out.println("Please enter number item");
		item=sc.nextInt();
		System.out.println("Please enter price");
		price=sc.nextInt();
		
		summ=item*price;
		
		for(int asq=1; asq>=1; asq++) {
			System.out.println("Please put money");
			money=sc.nextInt();
			moneq=moneq+money;
			if (moneq<summ) {
				System.out.println("Need add more money");
				continue;
			}else if (moneq>summ) {
				chang=moneq-summ;
				System.out.println("You change is "+chang);
				break;
			}else {
				System.out.println("You pay full price");
				break;
			}
		}
		
		

	}

}
