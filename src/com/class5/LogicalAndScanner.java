package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		  /* ask user to enter age 
		 * if age is from 1-3 - will say youre a baby
		 * if age 3-5 - you will say you are a toddler
		 * if age 5-12 - you will say you are a kid
		 * if age 12-19 - you are a teenager
		 * if age >20 you are an adult
		 * testing multiple conditions
		 * we will be using if greater, equal, and 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		if(age>=1 && age<3) {
			System.out.println("You are a baby");
		}else if (age>=3 && age<5) {
		 	System.out.println("You are a toddler");
		}else if (age>=5 && age<12) {
			System.out.println("You are a kid");
		}else if (age>=12 && age<19) {
			System.out.println("You are a teenager");
			}else {
				System.out.println("You are an adult");
			}
	}
}




