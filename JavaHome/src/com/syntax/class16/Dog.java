package com.syntax.class16;

public class Dog {

	String name, size;
	int age;
	
	static String breed="huski";
	static int paws =4;
	static int tail=1;
	static int eyes=2;
	
	void disDog() {
		System.out.println("the Dog name "+name+" size of dog "+ size+" age "+ age);
		System.out.println("Breed "+breed+" Paws "+ paws+" Tail "+tail+" EyeS "+ eyes);
	}
	
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.name="Lusy";
		dog1.size="big";
		dog1.age=5;
		dog1.disDog();
		breed="chihua";
	
		
		Dog dog2=new Dog();
		dog2.name="dyk";
		dog2.size="small";
		dog2.age=3;
		dog2.disDog();
		
		Dog dog3=new Dog();
		dog3.name="dpic";
		dog3.size="big";
		dog3.age=1;
		dog3.disDog();
		
		Dog dog4=new Dog();
		dog4.name="lic";
		dog4.size="small";
		dog4.age=5;
		dog4.disDog();
	}
}
