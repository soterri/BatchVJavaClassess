package com.repltasks;

import java.util.Scanner;

public class ReplScannerArray {
	
	public static void main(String[] args) {
//		Write a program that creates an array of strings with the size being 7. 
//		Ask the user to input Days of a week beginning with Sunday using Scanner class.
//		Add these inputs to your array and then print all values from that array
//
//		Example:
//		Please enter day 1 of the week
//		Sunday
//		Please enter day 2 of the week
//		Monday
//		Please enter day 3 of the week
//		Tuesday
//		Please enter day 4 of the week
//		Wednesday
//		Please enter day 5 of the week
//		Thursday
//		Please enter day 6 of the week
//		Friday
//		Please enter day 7 of the week
//		Saturday
//
//		Hint: you will need 2 for loops but it is not nested loops. 
		
		Scanner scan;
		String days;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter day");
		days=scan.nextLine();
		
		String[] dayOfWeek= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		System.out.println(dayOfWeek[0]);
		
		for(int i=0; i<=7; i++) {
			

		}
		
		
	}

}
