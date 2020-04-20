package com.syntax.class17;

public class Tack {

	int[] array= {1,2,3,4,5};
	int sum;
	
	void method() {
		for (int i=0; i<array.length; i++) {
			sum=sum+array[i];
		}System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		Tack obj=new Tack();
		obj.method();
		
	

	}

}
