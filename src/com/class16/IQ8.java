package com.class16;

public class IQ8 {
public static void main(String[] args) {
	
	
	/* write a java program to print the first 10 #'s of Fibonacci series
	 * 
	 */
	
	int a, b, c;
	a= 0;
	b=1;
	
	for (int i= 0; i<=10; i++) {
		System.out.print(a+" ");
		
		c=a+b;
		a=b;
		b=c;
		
	}
}
}
