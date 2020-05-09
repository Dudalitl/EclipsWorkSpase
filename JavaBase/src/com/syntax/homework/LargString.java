package com.syntax.homework;

public class LargString {


	  public static String maxLength(String[]array) {
		  
		  String largest=array[0];
		  
		  for (int i=1; i<array.length; i++) {
			  if (largest.length()<array[i].length()) {
				  largest=array[i];
			  }
			
				  
			  
		  }
		  return largest;
		  
	  }
		
		public static void main(String[] args) {
			String[] arr = {"hey","yolo","hi","this is long"};
			System.out.println(maxLength(arr));
			//should print "this is long"
		}
		
	}