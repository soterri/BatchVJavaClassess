package com.class9;

public class InClassTasksPyramid {

	public static void main(String[] args) {
		
		
		
		// print the following pattern
		//55555
		//4444
		//333
		//22
		//1
			
		for (int i=5; i>=1; i--) {
		for (int j=1; j<=i; j++) {
		System.out.print(i);
		}
		System.out.println();
	}
		//print the following pattern
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		for( int i=1; i<=5; i++) {
		for (int j=1; j<=i; j++) {
			System.out.print("*");
			
		}
		System.out.println();
		}
		for (int a=4; a>=1; a--) {
		for (int b=1; b<=a; b++) {
			System.out.print("*");
		}
		System.out.println();
		}
		}
}


