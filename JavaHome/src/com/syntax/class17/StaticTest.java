package com.syntax.class17;

public class StaticTest {

	public static void main(String[] args) {
		
		Phones.brand="Android";
		Phones.toochScreen=true;
		Phones.displayInfo();
		
		Phones qwe=new Phones();
		qwe.color="red";
		qwe.memori=256;
		qwe.displaySpec();
		
		Phones qwe1=new Phones();
		qwe1.color="red";
		qwe1.memori=256;
		qwe1.brand="Nokia";
		
		qwe.displayInfo();
		qwe1.displayInfo();
		
	}

}
