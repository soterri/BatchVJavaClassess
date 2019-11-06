package com.class4;

import java.util.Scanner;

public class replHomework {

	  
	  public static void main(String[] args) {
		 
		  	Scanner scan= new Scanner(System.in);
			System.out.println("Please enter your age");
			int number=scan.nextInt();
	    
	    int age=20;
	    
	    if (number<18) {
	      System.out.println("You are not eligible to vote");
	    }else {
	    	System.out.println("You are eligible to vote");
	    
	    
	    }
	  }
}

	