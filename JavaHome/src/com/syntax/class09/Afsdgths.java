package com.syntax.class09;

import java.util.Scanner;

class Main {
	 public static void main(String[] args) {
		    Scanner inp;
		    int end;
		    System.out.print("Int:");
		    inp=new Scanner(System.in);
		    end=inp.nextInt();
		    
		    for(int x=0; x>0; x++){
		      if (end>0){
		        if (x<end){
		          System.out.print(x+" ");
		        }else {
		          break;
		        }
		        
		      }else {
		        System.out.println("(no output)");
		      }
		        
		      }
		    }
		    
		    
		  }



