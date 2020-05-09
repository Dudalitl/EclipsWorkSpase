package com.syntax.class03;

public class PrimitivCasting {

	public static void main(String[] args) {
		//widening, happens implicity
		
		double d=10;
		System.out.println(d);
		
		//int i=10.99;--> compile convert double to int
		//type mismatch, cannot convert doubleto int
		
		//narrowing, explicity inmplementing
		
		int i=(int)10.99;
		System.out.println(i);
		
		//bute -128 to 127
		
		byte b=(byte)1287;
		
		System.out.println(b);

	}

}
