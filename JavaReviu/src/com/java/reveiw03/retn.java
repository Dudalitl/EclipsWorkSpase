package com.java.reveiw03;

public class retn{
		  
		  public final void method (boolean bool){
		    System.out.println("Final method with boolean parameter");
		  }
		  public final void method1 (String str){
		    System.out.println("Final method with String parameter");
		  }
		  
		  public final String method(String str) {
			  String srt="";
			  srt=str;
			  return srt;
			
		  }
		  public static void main (String [] args){
			  
			  retn qwe=new retn();
			  qwe.method(true);
			  //qwe.method("qwe");
			  System.out.println(qwe.method("olleh"));
		  }

		}