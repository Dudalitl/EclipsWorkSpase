package com.java.reveiw;

public class CarObjTest {

	public static void main(String[] args) {
		
		CarObjects car1= new CarObjects("Toyota", 25000,100);
		CarObjects car2= new CarObjects("BMW", 65298,10);
		
		car1.carStockValue();
		car2.carStockValue();

	}

}
