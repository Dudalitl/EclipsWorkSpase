package com.java.reveiw;

public class CarTEST {


  public static void main (String [] args){    
	CarRipl car1=new CarRipl("Toyota", "Prius", 4, 120, 30000.0);
    car1.display();
    CarRipl car2=new CarRipl("Toyota", "Prius",  120, 30000.0);
    car2.display();
    CarRipl car3=new CarRipl(4, 120, 30000.0);
    car3.display();
    CarRipl car4=new CarRipl("Toyota", "Prius", 4);
    car4.display();
	
	
  }

}
