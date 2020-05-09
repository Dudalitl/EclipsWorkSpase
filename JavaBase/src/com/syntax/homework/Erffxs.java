package com.syntax.homework;

public class Erffxs {

		  
		  private void m1() {
		    System.out.println("This is Private Method");
		  }
		  void m2() {
		    System.out.println("This is Default Method");
		  }
		  protected void m3() {
		    System.out.println("This is Protected Method");
		  }
		  public void m4() {
		    System.out.println("This is Public Method");
		  }
		  public static void main (String[] args){
			  Erffxs obj=new Erffxs();
		    obj.m1();
		    obj.m2();
		    obj.m3();
		    obj.m4();
		  }
		}