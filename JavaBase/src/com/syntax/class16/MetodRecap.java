package com.syntax.class16;

public class MetodRecap {

	int getLargestNuber(int [] array) {
		int largest=array[0];
		
		for (int i=1; i<array.length; i++) {
			if (array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
	}
	
	String [] getWords(String str) {
		String[] array=str.split(" ");
		return array;
		
		//public static void main (String[] args) {
			
			
		}
	}
	

