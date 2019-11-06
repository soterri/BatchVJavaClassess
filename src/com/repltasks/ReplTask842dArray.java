package com.repltasks;

public class ReplTask842dArray {

	public static void main(String[] args) {
	
		
		//Write a program that prints the highest value in the array.
		
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		
		int largest = a [0][0];
		for (int row=0; row<a.length; row++) {
			for(int j=0; j<a[row].length; j++) {
				if (a[row][j] > largest) {
					largest = a[row][j];
					
				}	 
			}
			System.out.println(largest);
			
		}
	}
}

