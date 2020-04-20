package com.syntax.class17;

public class Phones {
	
	String color;
	int memori;
	
	static String brand;
	static boolean toochScreen;
	
	
	static void  displayInfo() {
		System.out.println("we are build phone "+ brand+" with toch screen="+toochScreen);
	}
	
	void displaySpec() {
		System.out.println("we are build phone "+ memori+" GB memori in "+color+" color");
	}

	public static void main(String[] args) {
		
		brand="Iphone";
		toochScreen=true;
		
		Phones obj=new Phones();
		obj.memori=128;
		obj.color="gray";
		
		obj.displayInfo();
		obj.displaySpec();
	}

}
