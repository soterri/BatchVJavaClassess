package com.class4;

import java.util.Scanner;

public class ScannerNotes {

	public static void main(String[] args) {
		
		//a class that will take a user input.. will bringing it for purposes
		//a class that will allow an input from a user, a class from java
		//SCANNER making program more interactive
		//ex-when logging into fb, ig, etc you use a username and pw before getting in - its called 
		//user input.. so to get an input in java you use a SCANNER.. to get input from a user 
		// type variable assign
		/*nextInt();->for numbers
		 * nextline(); Strings;
		 * nextDouble();-> double
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter any number");
		int number=scan.nextInt();
        System.out.println("entered number is " +number);
        
        System.out.println("*********");
        
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine();
        System.out.println("Goof afternoon " +name);
        
        System.out.println("*********");
        
        
        
        
        
        
	}
}