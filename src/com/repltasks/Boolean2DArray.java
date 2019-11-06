package com.repltasks;

public class Boolean2DArray {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
	 //should be true
		
	 boolean square = true;
	 
	 for(int i=0; i<a.length; i++){
	   for(int j=0; j<a[i].length; j++){
	     
	     if(a.length!=a[i].length){
	       square=false;
	       break;
	     }
	     
	   }
	 }
	 System.out.print(square);
	     }
	   
	 }

