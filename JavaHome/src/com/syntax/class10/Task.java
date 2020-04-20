package com.syntax.class10;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
	
		
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    //write your code below
		   // String [] st;
		    //st=s.split(" ");
		    
		    //for (int ind=0; ind<st.length; ind++) {
		    s = s.replaceAll(" ", "");
		    System.out.print(s);
	}

}
