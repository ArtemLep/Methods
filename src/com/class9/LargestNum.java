package com.class9;

public class LargestNum {

	public static void main(String[] args) {
	// find largest NUM
		
		int[] numbers = {122,133,144,515,716,187};
		 int size = 0;
	      
	    for  (int num=0; num<numbers.length;num++) {
	    	if(numbers[num]>size) {
	    		size=numbers[num];
	    	}
	    }
	    
	  
	      System.out.println("largest element is "+size);
	   }
	

	}


