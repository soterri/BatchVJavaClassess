package com.class6;

public class Loop {

	public static void main(String[] args) {
		
		
		
		
		int time=8; //declare and initialze variable
		
		if(time<12) { // condition is true
			System.out.println("Good Morning"); // code executes 1
		}
		while (time<12) { //if condition is true
			System.out.println("Good Morning"); //code executes infinitely, no ending 
			//infinite loop bc theres no stop.. to stop it we can either have BREAK or
			time++; 
			//adding 1 an increment 8+1=9 .. now testing 9 and incrementing by 1 =10 
			//+1 11 + 1 12 +1 13  
			// it will stop when the first condition is met 
			// a counter variable will stop looking
			//while loop syntax
			// initialize variable (should be outside of loop)
			// while (test variable --> true) {
			//code;
			//variable increment or decrement; 
		
			
			int i=12;
			while (i<17) {
				System.out.println("GM");
			i++;
			}
			System.out.println("Outside of while loop");
			
			}
		}
	}


