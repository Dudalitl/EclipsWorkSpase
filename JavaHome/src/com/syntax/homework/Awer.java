package com.syntax.homework;

public class Awer {

		  public static String mixString(String s1, String s2){
		    String c="";
		    for (int i=0; i<s1.length(); i++){
		      c=c+s1.charAt(i);
		      c=c+s2.charAt(i);
		      
		    }return c;
		    
		  }
			
			
			//test case below (dont change):
			public static void main(String[] args){
			  String firstValue = mixString("12345","abcde"); 
				System.out.println(firstValue); 
				String secondValue = mixString("howdy","hello");
				System.out.println(secondValue); 
			}
		}