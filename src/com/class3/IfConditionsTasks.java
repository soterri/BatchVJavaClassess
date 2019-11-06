package com.class3;

public class IfConditionsTasks {

	public static void main(String[] args) {
		
		//int expectedHours=15;
	//int actualHours=2;
		//if expected hours are more than actual ->you will suceed
		//otherwise, please study
		
		//if (actualHours>expectedHours) {
			//System.out.println("you will succeed");
			
		//}else {
			//System.out.println("please study more");
			//depending on the if condition being true or false.. the true will print
			//if conditions has to have their own opening/closing {} 
			
		int num1=20;
		int num2=10;
		
		if (num1>num2) {
			System.out.println("Double value " +num1+ " is larger than " +num2);
			}else {
				System.out.println("Double value " +num2+ " is larger than " +num1);
				}
		
		boolean val=false;
		if (val) {
			System.out.println("Hello");
			}else {
				System.out.println("bye");
				
			}
		boolean isRain=true;
		if (isRain) {
			System.out.println("I will take an umbrella");
		}else {
			System.out.println("I'll go for a walk");
			
		}
	}
}