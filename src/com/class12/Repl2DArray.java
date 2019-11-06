package com.class12;

public class Repl2DArray {

	public static void main(String[] args) {
	
		
		
	
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
	int total=0;
	for(int row=0; row <a.length; row++) {
		for(int j=0; j<a[row].length; j++) {
			total+=a[row][j];
		}
		System.out.println(total);
	}
		
	
		
			}
		
		
		
	}

