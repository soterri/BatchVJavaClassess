package com.class10;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
	
		
		
		Scanner scan;
		int secretNumber, guessNumber;
		
		scan=new Scanner(System.in);
		secretNumber=12;
		// for (int i=0; i<20; i++); --> using for loop limits user to only 20 inputs
		do {
			System.out.println("Please enter guess number from 1-20");
			guessNumber=scan.nextInt();
			
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
				
			} else if(guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}
			
		}while (guessNumber!=secretNumber);
		
		System.out.println("Congrats ya got it!");
	}
	}


