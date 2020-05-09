package com.syntax.class14;

public class dog {
	
	String breed;
	String color;
	String name;
	int age;

	public static void main(String[] args) {
		dog dog1=new dog();
		dog1.breed="Shepard";
		dog1.color="brown";
		dog1.name="rich";
		dog1.age=4;
		
		dog1.eat();
		dog1.run();
		
		dog dog2=new dog();
		dog2.breed="haski";
		dog2.color="white";
		dog2.name="lusi";
		dog2.age=3;
		
		dog2.eat();
		dog2.run();
		
	}
	void eat() {
		System.out.println(name+" can eat");
	}
	void run() {
		System.out.println(name+" can run");
	}

}
