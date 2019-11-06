package com.repltasks;

import java.util.Scanner;

public class NestedIfAndScanner {

	public static void main(String[] args) {
		
//		// scanner is a class in java that allows inputs from users
//		//creating the object of the class and storing the variable
//		//types of scanners
//		//nextInt(); -->numbers
//		//nextLine(); -->Strings
//		//nextDouble(0; - -->double values
//		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter any number");
//		int number=scan.nextInt();
//		System.out.println("Entered number is "+number);
//		
//		System.out.println("**************");
//	
//		Scanner input=new Scanner(System.in);
//		System.out.println("Enter name");
//		String name=input.nextLine();
//		System.out.println("Hello " +name);
//		
//		System.out.println("***********");
		
		
		Scanner keyboard=new Scanner(System.in);
		//task is to ask user to enter 2#'s and than compare 
		//which is larger
		System.out.println("Please enter first number");
		int num1=keyboard.nextInt();
		System.out.println("Enter second number");
		int num2=keyboard.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+ " is larger than " +num2);
		}else if (num1==num2){
			System.out.println(+num1+ " is equal to " +num2);
		}else{
			System.out.println(num1+" is smaller than " +num2);
		}

	}

}
