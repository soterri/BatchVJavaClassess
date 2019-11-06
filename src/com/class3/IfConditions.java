package com.class3;

public class IfConditions {

	public static void main(String[] args) {
		
		int a=90;
		int b=300;
		
		if (a>b) {
			System.out.println("a is larger than b");
		}else {
			System.out.println("a is smaller than b");
			
		}
		int expectedHours=15;
		int actualHours=2;
		//if expected hours are more than actual ->you will suceed
		//otherwise, please study
		
		if (actualHours>expectedHours) {
			System.out.println("you will succeed");
			
		}else {
			System.out.println("please study more");
			//depending on the if condition being true or false.. the true will print
			//if conditions has to have their own opening/closing {} 
			}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2; //2.99=4.99-2
		
		//if price is more than i can afford i will not buy
		//if price is less or matches what i can afford than i will buy tea
		
		if (allowedPrice>=teaPrice) {
		System.out.println("I will buy tea");
		System.out.println("I will enjoy my tea");
		}else {
		System.out.println("I cannot afford, I need to study more");
		System.out.println("I will go back to study more");
		} 
		
		System.out.println("I keep writing the same code");
		
	}
}
