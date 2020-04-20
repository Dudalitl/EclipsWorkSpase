package com.syntax.homework;

public class LargArrayNumb {


		  
		protected static int maxValue (int [] array){
			  int largest=array[0];
			  for (int i=1; i<array.length; i++) {
				  if (largest<array[i]) {
					  largest=array[i];
				  }
			  }
			  return largest;
		  }
		    
		 

			public static void main(String[] args) {
				int[] arr = {5,12,-3,7,3,22};
				System.out.println(maxValue(arr)); //should print 22
			}
}