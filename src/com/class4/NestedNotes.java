package com.class4;

public class NestedNotes {

	public static void main(String[] args) {
		
		
		
		
		//if the condition is true than will go inside the if block 
		boolean b=false;
		boolean classToday=true;
		
		if (b) {
			System.out.println("hello");
			if (classToday) {
				System.out.println("Hello my friends");
			}
			}else {
				System.out.println("bye");
			}
			System.out.println("I am continues code");
			
			//           
			boolean isFriday=true;
			int day=131;
			//if today is friday, than it is the only thing i want to check for!! 
			//outer if 
			if (isFriday) {
				System.out.println("Today is Friday");
				
			if (day==13) {
				System.out.println("I want to watch a scary movie");
			}
			}else {
				System.out.println("Today is NOT Friday");
			}
	}
}
		

	