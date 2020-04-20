package com.syntax.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int day=6;
	
		String day1="Saturday";
		
		if (day1.equals("Tuesday")|| day1.equals("Wednesday")) {
			System.out.println("Today is SDLC Class");
		}else if (day1.equals("Saturday")|| day1.equals("Sunday")) {
			System.out.println("Today is JAVA class");
		}else if (day1.equals("Thursday")){
			System.out.println("Today is a review class");
		}else {System.out.println("Today is free day");
			
		}
		
	
		System.out.println("-----------------------------");
		
		if (day==2|| day==3) {
			System.out.println("Today is SDLC Class");
		}else if (day==6|| day==7) {
			System.out.println("Today is JAVA class");
		}else {System.out.println("Today is free day");
		
		}
		
	}

}
