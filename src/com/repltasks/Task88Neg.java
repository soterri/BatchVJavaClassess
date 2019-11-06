package com.repltasks;

public class Task88Neg {

	public static void main(String[] args) {
		
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
			
		int sum= 0;
		for (int row=0; row<a.length; row++) {
			for (int column=0; column<a[row].length; column++){
			
				     sum = sum + a[row][column];
				     
				        }
				    }

				    System.out.println(sum);
		}
			
	//   should print -9
	

		
	}
