package com.syntax.homework;

public class GFD {

		
		public static String surround(String s, String serch_term){
		  String sis="";
		sis=s.replaceAll(serch_term, "("+serch_term+")");
		       	
		 
		  
		    return sis;
		  }
		  
			
		
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
			System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
		}
	}
