package com.syntax.class04;

public class NestingElseifs {
	
	public static void main(String[] args) {
		
		boolean quiz=false;
		int score=55;
		
		if (quiz) {
			System.out.println("let's check your scote");
			
			if (score>90) {
				System.out.println("good");
			}else if (score>80) {
				System.out.println("well");
			}else if (score>70) {
				System.out.println();
			}
		}
	}

}
