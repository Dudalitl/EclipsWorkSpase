package com.syntax.class16;

public class Local {
	
	void nameInside() {
		
		String name= "Jone"; // local variable
	}
	 public static void main (String[] args) {
		// System.out.println(name); name doesn't work without metod
	 
		 Local obj=new Local();
		 obj.nameInside();
		 
	 
	 boolean flag=true;
	 if (flag) {
		 String answer="yes";
	 }
	 //System.out.println(answer);
	 }
	
}
