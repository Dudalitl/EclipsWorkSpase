package com.syntax.homework;

import java.util.Scanner;

public class Aqws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String givenString = inp.nextLine();
   	//write your code below
   	givenString=givenString.replaceAll(" ", "");
   	givenString=givenString.toLowerCase();
   	String backWord="";
   	
   
   for (int i=(givenString.length())-1; i>=0; i--) {
	   backWord=backWord+givenString.charAt(i);
   }if (backWord.contentEquals(givenString)) {
	   System.out.println("true");
   }else {
	   System.out.println("false");
   }
   	
   	
   	
  }
}