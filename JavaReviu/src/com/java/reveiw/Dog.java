package com.java.reveiw;

public class Dog {

	String dogName;
	  double dogWeight;
	  static String dogBreed="Mutt";
	  
	  Dog(String dogName,double dogWeight){
	    this.dogName=dogName;
	    this.dogWeight=dogWeight;
	  }
	  
	  void display() {
		  System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	  }
	  }
