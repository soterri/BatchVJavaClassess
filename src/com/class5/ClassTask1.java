package com.class5;

import java.util.Scanner;

public class ClassTask1 {

	public static void main(String[] args) {
	

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the month you were born");
		String month=scan.nextLine();
		String season;
		

		
		if(month.equals("January") || month.equals("February") || month.equals("December")) {
			season="Winter";
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if (month.contentEquals("Sept") || month.equals("October") || month.equals("November")) {
			season=("Fall");
			System.out.println("You were born in " +season);
		}else { 
			System.out.println("Invalid month");
			
			
		
		}
		}

}
