package com.repltasks;

import java.util.Scanner;

public class NesIf {

	public static void main(String[] args) {
		//Prompt user to input either "M" or "F" as a String "gender" and input any value as int "age". 

		//You have 2 conditions:
		//If age is above 25, your inner condition, depending on your gender value, should get either "Woman" or "Man" as an output. 
		//If age is below 25, your inner condition, depending on your gender value, should get either "Girl" or "Boy" as an output. 

		//Instruction: after you run your code, start inputing your values without Prompt question to appear. 

		//Hint: your age should not be equal to 25. 

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter gender");
		String gender=scan.nextLine();
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		
		if(age>25 && gender.equals("W")) {
			System.out.println("Woman");
		}else {
			System.out.println("Man");
		}
	}
}
