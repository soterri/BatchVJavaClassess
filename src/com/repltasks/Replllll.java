package com.repltasks;

import java.util.Scanner;

public class Replllll {
	
	public static void main(String[] args) {
		
		
		
		String instructor, job;
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Enter name of instructor");
		instructor=scan.nextLine();
		job=scan.nextLine();
		
		switch(instructor) {
		case "Shiva": 
			job="Will take care of Java Assignment";
			break;
			
		case "Sandish":
			job="Will take care of SDLC Assignment";
			break;
			
		case "Weqas":
			job="Will take care of Selenium Assignment";
			break;
			
		case "Asel":
			job="Will take care of every Assignment";
			break;
	
		default:
			job="invalid instructor selected";
		
		}	
			System.out.println(job);
	}

}