package com.java.reveiw;

public class CarRipl {


		  String make;
		  String model;
		  int numberOfDoors;
		  int topSpeed;
		  double price;
		  
		  CarRipl(String make, String model, int numberOfDoors, int topSpeed, double price){
		    this.make=make;
				this.model=model;
				this.numberOfDoors=numberOfDoors;
				this.topSpeed=topSpeed;
				this.price=price;
		    
		  }
		  CarRipl(String make, String model, int topSpeed, double price){
		    this.make=make;
				this.model=model;
				this.topSpeed=topSpeed;
				this.price=price;
				numberOfDoors=4;
		    
		  }
		  CarRipl(int numberOfDoors, int topSpeed, double price){
		    make="unknown";
				model="unknown";
				this.numberOfDoors=numberOfDoors;
				this.topSpeed=topSpeed;
				this.price=price;
		    
		  }
		  CarRipl(String make, String model, int numberOfDoors){
		    this.make=make;
				this.model=model;
				this.numberOfDoors=numberOfDoors;
				topSpeed=90;
				price=0;
		  }
		  void display() {
		    System.out.println (make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
		  }
		}