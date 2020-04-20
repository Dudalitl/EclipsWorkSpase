package com.syntax.homework;

public class Alfa {

		  
		  public static String alphabetical(String str) {
			  String temp="";
			  char [] chArray=str.toCharArray();
		    for (int i=0; i<chArray.length; i++){
		    	for(int j=i+1; j<chArray.length; j++) {
		    		if(chArray[i]>=chArray[j]) {
		    			temp=temp+chArray[i];
		    		}
		    		
		    	}
		    }
		    return temp;
		  }

			
			//test case below (dont change):
			public static void main(String[] args){
				System.out.println(alphabetical("hello")); //"hlo"
				System.out.println(alphabetical("software")); 
				System.out.println(alphabetical("language"));
			}
		}