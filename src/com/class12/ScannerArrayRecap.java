package com.class12;

import java.util.Scanner;

public class ScannerArrayRecap {

	public static void main(String[] args) {
		
		
//		
//		int[] array2= {2,5,4,7};
//		
//		for(int i: array2) {
//			System.out.println(i);
//		}
//		int[] arr=new int[3];
//		Scanner scan=new Scanner(System.in);
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=scan.nextInt();
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]+" ");
		
		
		int[] nums= {1,2,3,4,5};
		
		
		for(int i: nums) {
			System.out.println(i);
		}
		int[] arr=new int[5];
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		int[] nums1= {1,2,3,4,5};
		int mult=0;
		
		for(int j=1; j<nums.length; j++) {
			mult=mult*nums1[j];
		
		System.out.println(j);
		
		}
		}
}

	
	