package com.syntax.homework;

public class constractor {

		   String schoolName;
		   int batch;
		   int year;
		   String lastDayOfClass;
		  
		  constractor()
		  {
			  
		  }
		  
		  constractor(String schoolName,int batch, int year, String lastDayOfClass)
		  { this.batch=batch;
		  this.lastDayOfClass=lastDayOfClass;
		  this.schoolName=schoolName;
		  this.year=year;
			  
		  }
		  
		   void m1() {
			  System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass); 
		  }
		  
}  
		