package com.class5;

import java.util.Scanner;

public class SwitchLimits {

	public static void main(String[] args) {
		
		
		
		System.out.println("Do you need a loan?");
		Scanner scan=new Scanner(System.in);
		boolean loan=scan.nextBoolean();
		
		int score; 
		
		if(loan) {
		System.out.println("What is your credit score?");
		score=scan.nextInt();
		
		if(score<=600) {
			System.out.println("You are not eligible for a loan");
		}else if (score>600 && score<700) {
			System.out.println("You may be elgible for a loan");
		}else if (score>701 && score<800) {
			System.out.println("You are eligible for a loan");
		}else if (score>800) {
			System.out.println("You are defintely eligible for a loan!");
		}else {
			System.out.println("The eligibilty is unknown");
			
		}
		System.out.println();
		}
	}
	}
