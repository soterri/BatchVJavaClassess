package com.class4;

import java.util.Scanner;

public class ScannerPracticeTasks {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner loan=new Scanner(System.in);
		System.out.println("What is the loan amount");
		int amount=loan.nextInt();
	
		
		if(amount<200000) {
			System.out.println("You are eligible for a loan");
		}else {
			System.out.println("You are not eligible for a loan");
			
			 
		 }
		Scanner license=new Scanner(System.in);
		System.out.println("What is the age to get your license");
		int age=license.nextInt();
		
		if(age<18) {
			System.out.println("You will get your learners permit");
		}else {
			System.out.println("You will not get your learners permit");
		}
	}

}


//Scanner keyboard=new Scanner(System.in);
//System.out.println("Please enter first number");
//int num1=keyboard.nextInt();

//System.out.println("Please enter second number");
//int num2=keyboard.nextInt();

//if(num1>num2) {
	//System.out.println(num1+ " is larger than "+num2);
//}else if(num1 == num2) {
	//System.out.println(num1+ " is equal to " +num2);

//}else {
	//System.out.println(num1+ " is smaller than "+num2);