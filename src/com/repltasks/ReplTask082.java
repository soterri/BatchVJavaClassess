package com.repltasks;

public class ReplTask082 {

	public static void main(String[] args) {
	

		
	
				int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
				int sum=0;
				for (int row=2; row <a.length; row++ ) {
					for(int j=0; j<a[row].length; j++) {
					sum+=a[row][j];
					
			}
			System.out.println(sum);
			
			
				}
	 
}
}