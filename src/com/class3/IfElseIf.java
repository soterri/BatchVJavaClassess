package com.class3;

public class IfElseIf {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println("Num1 is larger than Num2");

		} else if (num1 == num2) {
			System.out.println("Num1 is equal num2");

		} else {
			System.out.println("Num1 is smaller than num2");
		}

		int day = 6;
		if (day == 1) {
			System.out.println("Today is Monday. I have to go to work");
		} else if (day == 2) {
			System.out.println("Today is Tuesday. I have SDLC class");
		} else if (day == 3) {
			System.out.println("Today is Weds. I have to go to work");
		} else if (day == 4) {
			System.out.println("Today is Thurs. I have class");
		} else if (day == 5) {
			System.out.println("Today is Friday. I have work");
		} else if (day == 6) {
			System.out.println("Today is Saturday. I have class");
		} else if (day == 7) {
			System.out.println("I got Syntax class");
		} else {
			System.out.println("I love spending Sundays at Syntax");
		}
		System.out.println("I am done with if statement");

	}
}