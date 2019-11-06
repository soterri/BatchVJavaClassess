package com.class6;

public class IncrementandDec {

	public static void main(String[] args) {
		
		//increment and decrement
		
		int a=10;
		a=a+1; // assigning
		a+=1; // shorthand
		
		System.out.println(a); // answer is 12
		a++; // increment operator
		System.out.println(a);
		
		int b= 10;
		b-=1; // answer is 9 
		b--; // decrement operator
		System.out.println(b);
		
		// with increment and decrement operators can be used only with variables;
		
		//cannot do 1++ cant be used with constant variables 
		
		int c=23;
		c++;
		//1++; compiler error invalid argument
		
		
		
	}

}
