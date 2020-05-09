package com.syntax.class14;

public class car {
	
	//define feature of the car
	String make;
	String model;
	int year;
	String color;
	int spead;

	//define behavior
	
	void drive() {
		System.out.println(make+" can drive");;
	}
	void acceleration() {
		System.out.println(make+"can acceleration");;
	} 
	void makeNoise() {
		System.out.println(make+" can make noise");
	}
	void stop() {
		System.out.println(make+"car can stop");
	}
}
