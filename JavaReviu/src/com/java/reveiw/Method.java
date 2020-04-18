package com.java.reveiw;

public class Method {
	
	
	
	public int m1 (int [][] array) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				sum=sum+array[i][j];
			}
		}
		return sum;
		
	}

}
