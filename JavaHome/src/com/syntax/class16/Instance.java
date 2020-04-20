package com.syntax.class16;

public class Instance {
	
	String name= "John";
	
	public static void main (String[] args) {
		
		String name="yuri";
		System.out.println(name);
		
		Instance abj=new Instance();
		System.out.println(abj.name);
		
		abj.name="Ali";
		System.out.println(name);
		System.out.println(abj.name);
		
		name="Farid";
		System.out.println(name);
	}

}
