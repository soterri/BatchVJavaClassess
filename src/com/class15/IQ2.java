package com.class15;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {
		// write a java program to find the 2nd largest # in the array
		//max and min # in array
		
	
		int[] array= {100, -90, 8787, 898, 0, 1};
		// multiple ways to do this
		
		//1. this is the easiest way array sort
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		
		System.out.println(min);
		System.out.println(max);
		
		//2 way. if..
		int[] myArray= {100, -90, 8787, 898, 0, 1};
		int largest = myArray[0];
		int smallest =myArray[0];
		// we need to comp each element inside array so will for loop
		
		for (int i=0; i<myArray.length; i++) {
			if(myArray[i]>largest) {
				largest=myArray[i];
				
			}
			if (myArray[i]<smallest) {
				smallest=myArray[i];
			}
		}
		System.out.println("The smallest value in the array is " +smallest);
		System.out.println("The largest value in the array is " +largest);
		
		// 3 way
		int []nums = {100, -90, 8787, 898, 0, 1, -90, 8787};
		int large=nums[0];
		int secondLarge=nums[0];
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i]>large) {
			secondLarge=large;
			large=nums[i];
		}else if (nums[i]>secondLarge && nums[i]<large) {
				secondLarge=nums[i];
				
			}
		}
		System.out.println("the 2 "+secondLarge);

	}

}
