package com.syntax.homework;

public class TestClass {

}
class Main {
	  
	  String breed, name, color;
	  
	  void bark() {
	    
	    System.out.println(breed+" can bark");
	  }
	  void run(){
	    System.out.println(breed+" can run");
	  }
	  void play(){
	    System.out.println(breed+" can play");
	    
	  }
	  public static void main (String [] args){
	    
	    Main dog1=new Main();
	    dog1.breed= "Husky";
	    dog1.name= "Lusy";
	    dog1.color= "Blask";
	    
	    
	    Main dog2=new Main();
	    dog2.breed= "Bulldog";
	    dog2.name= "Ludy";
	    dog2.color= "Brown";
	    
	    Main dog3=new Main();
	    dog3.breed= "Labrador";
	    dog3.name= "Tusy";
	    dog3.color= "White";
	    
	    dog1.bark();
	    dog1.run();
	    dog1.play();
	    dog2.bark();
	    dog2.run();
	    dog2.play();
	    dog3.bark();
	    dog3.run();
	    dog3.play();
	    
	    
	    
	    
	  }
	}