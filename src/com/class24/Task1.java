package com.class24;

public class Task1 {

	
	/* Write a program that will have a private constructor class 
	 * and create 2 objects of the class: 
	 * 1. inside same class
	 * 2. from outside the class and observe result 
	 * 3 from different class inside different package
	 * 
	 */
	
	public static void main(String[] args) {
		int result=0;
		for (int i=0; i<5; i++) {
			if (i==3) {
				result+=10;
				
			}else {
				result +=i;
			}
		}
		System.out.println(result);
	}
	
	
}
