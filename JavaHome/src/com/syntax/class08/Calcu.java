package com.syntax.class08;

public class Calcu {

	public static void main(String[] args) {
		int num1;
		int summ=0;
		int summ1=0;
		
		for(int k=1; k<=99; k++) {
			num1=k%2;
			if (num1!=0) {
				summ=summ+k;
			}else {summ1=summ1+k;}		
			}
		System.out.println(summ);
		System.out.println(summ1);
		}
	}


