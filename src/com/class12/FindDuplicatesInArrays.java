package com.class12;

import java.lang.reflect.Array;

public class FindDuplicatesInArrays {

	public static void main(String[] args) {
	
		
		//System.out.println(array2[i]);
		//will have to create another loop to compare the nums
		//each time the indexes changes the cycle has to be completed
		
		int[] array2= {2,5,4,7,5,2,2};
		
		for (int i=0; i<array2.length; i++) {
		
		for(int j=i+1; j<array2.length; j++) {
			if(array2[i]==array2[j]) {
				System.out.println(array2[j]);
				
			}
			
		}

	}

}
}
