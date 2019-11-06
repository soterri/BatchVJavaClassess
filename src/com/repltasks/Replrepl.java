package com.repltasks;

import java.util.Scanner;

public class Replrepl {

	public static void main(String[] args) {
		
	 
		  boolean isSunny;
		    int temp;
		    temp=85;
		    
		    Scanner scan=new Scanner(System.in);
		    System.out.println("What is the weather?");
		    isSunny=scan.nextBoolean();
		    System.out.println("Check the temperature");
		    temp=scan.nextInt();
		    
		    if(isSunny==true){
		      System.out.println("It is a sunny day, I should go somewhere!");
		    }else if (!isSunny){
		      System.out.println("I stay home and practice Java");
		    }if (temp>85){
		      System.out.println("I am going to the beach");
		    }else if(temp<85){
		      System.out.println("I am going to the park");
		    }
		    
		    }
		    }



