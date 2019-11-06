package com.class10;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		
		//int[]nums=new int[21474836479]; the max #, will not run too big
		
		int[] nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[2]=14;
		nums[3]=15;
		System.out.println(nums.length); //to find the # of elements answer is 4
		//if changing the elements it will throw out the old one
		//the originial is nums[0]=12 but than changing nums[2]=14 to nums[0]=14; 
		System.out.println(nums[0]);
		
		//SHORTER WAY OF ARRAY 
		//the declaration part will stay the same
		//				   0		1	2		3
		String[] array= {"Winter", "Fall", "Summer", "Spring"};
		System.out.println("I was born in "+array[2]);
		//array.length will return an integer
		int arraySize=array.length;
		System.out.println(arraySize);
		
		int[] score= {80, 90, 70, 100, 99};
		System.out.println(score[3]);
		
		
		
		
		
	}

}
