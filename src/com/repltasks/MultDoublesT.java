package com.repltasks;

public class MultDoublesT {

	public static void main(String[] args) {
		
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
			//Double and print array
		for (double num[] :a){
		  for (double num1:num){
		    
		    double mult=0;
		    mult=num1*2;
		    System.out.println(mult+ " ");
		  }
		}
		System.out.println();
		

	}

}
