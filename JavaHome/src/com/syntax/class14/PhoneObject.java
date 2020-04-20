package com.syntax.class14;

public class PhoneObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone pho1=new Phone();
		pho1.model="Iphone";
		pho1.color="red";
		pho1.price=1000;
		pho1.opSistem="iOS";
		
		
		pho1.speak();
		pho1.mesage();
		pho1.internet();
		
		Phone pho2=new Phone();
		pho2.model="Android";
		pho2.color="black";
		pho2.price=900;
		pho2.opSistem="Android";
		
		pho2.speak();
		pho2.mesage();
		pho2.internet();
		
		Phone pho3=new Phone();
		pho3.model="Nokia";
		pho3.color="yelow";
		pho3.opSistem="Simbion";
		pho3.price=500;
		
		pho3.speak();
		pho3.internet();
		pho3.mesage();
		
	}

}
