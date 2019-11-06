package com.repltasks;

public class Repl872dNegAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
	int negative=0;
	for (int i = 0; i<a.length; i++){
	  for(int j=0; j<a[i].length; j++){
	    if(a[i][j]<0&&a[i][j]%2!=0){
	      negative=negative+1;
	      }
	  }
	  
	}
	System.out.println(negative);
			}
	
}

