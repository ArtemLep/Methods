package com.class9;

public class RetrievingAllValues {

	public static void main(String[] args) {
	
		int[][] num ={
			{11,12,13,14},
			{21,22,23},
			{31,32,33,34},
		};
		
		int rows=num.length;//How many rows
		System.out.println(rows);
		
	    int column=	num[1].length;//how many Columns
	    System.out.println(column);

	    for (int row=0;row<num.length;row++) {
	    	for(int columns=0;columns<num[row].length;columns++) {
	    		System.out.print(num[row][columns]+" ");//Print all num:  11.12.13.14.21.22.23.31.32.33.34
	    	}
	    	System.out.println();
	    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	    
	    
	    String[][] food= {//3,4
	    		         {"burger","fries","hot dog","meatloaf"},
	    		         {"lo mein","fried rice"},
	    		         {"biriyani","korma","naan","chick peas"},
	                     };  
	    
	    
	    for (int i=0;i<food.length;i++) {
	    	for(int j=0;j<food[i].length;j++) {
	    		System.out.print(food[i][j]+",");
	    	}
	    	System.out.println();
	    }
	    
	    
	}

}
