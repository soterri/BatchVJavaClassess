package com.class13;

import java.util.Scanner;

public class Task1StringManip {
public static void main(String[] args) {
	
	
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter your class day: ");
	String day=scan.nextLine();
	// can do it this way String day1= day.scan.nextLine(); method is called chaining
	if(day.trim().toLowerCase().equals("saturday")) {
		System.out.println("Saturday is your Java Class");
	}else if(day.equalsIgnoreCase("Sunday")) {
	System.out.println("Sunday is your GIT class");
	}else if(day.toUpperCase().equals("Tuesday")) {
		System.out.println("Tues is your SDLC class");
	}else if(day.equals("Thursday")) {
		System.out.println("Thurs is your Manual Testing class");
	}else {
		System.err.println("Invalid entry! Please enter a valid class day");
	}
	
	scan.close();
	
}
}
