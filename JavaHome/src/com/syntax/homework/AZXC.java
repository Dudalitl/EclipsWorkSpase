package com.syntax.homework;

public class AZXC {

		
		public static int countA(String s){
		  int c=0;
		  char r;
		  for (int i=0; i<s.length(); i++){
			  r=s.charAt(i);
		    if (r=='a'||r=='A'){
		      c=c+1;
		    }else {
		      continue;
		    } 
		  }
		return c;
			
		}
		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(countA("aaA")); //3
			System.out.println(countA("aaBBdf8k3AAadnklA")); //6
		}
	}