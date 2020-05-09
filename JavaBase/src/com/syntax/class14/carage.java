package com.syntax.class14;

public class carage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car car1=new car();
		car1.make="BMW";
		car1.model="M5";
		car1.year=2020;
		car1.color="Blue";
		
		car1.drive();
		car1.stop();
		car1.makeNoise();
		car1.acceleration();
		
		
		car car2=new car();
		car2.make="Volvo";
		car2.model="S70";
		car2.year=2020;
		car2.color="Red";
		
		car car3=new car();
		car3.spead=220;
		
		System.out.println(car2.make);
		
		System.out.println(car1.make+" "+car1.color);
		
		////
		
		
		car2.stop();
		car2.makeNoise();
		car2.drive();
		car2.acceleration();
		
		
	}

}
