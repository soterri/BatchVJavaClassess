package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		/*check age, if age is less than 16 --> too young to drive
		 * otherwise, we will check if you are older than 18 -> than can get drivers license
		 * and if not you can get a drivers permit
		 */
		
		int age=55;
		// the first condition we are checking the age less than 16
		//outer if
		//here condition is satisfied, so entire block will be ignored
		//if condition is false it will go into the if block
		if (age<16) {
			System.out.println("You are too young to drive");
		}else {
			System.out.println("You are eligible to drive");
			//nested if
			if (age>=18) {
				System.out.println("You can drive alone");
			
			}else {
				System.out.println("You need your parents to drive");
			}
		}
		System.out.println("******************");
		/*we need to check if student completed the quiz
		 * if yes --> good job, if not--> not good
		 * if they completed we will check the score:
		 * if more than 90 --> you got an A
		 * if more than 80 --> you got a B
		 * anything else below --> you should study more
		 */
		//first check the outer cond1ition, than identify variable
		boolean quiz=true;
		int score=80;
		
		if (quiz) {
			System.out.println("Good job!");
			if(score>=90) {
				System.out.println("You got an A");
			}else if(score>80) {
				System.out.println("You got a B");
			}else {
				System.out.println("You should study more");
			}
		}else {
			System.out.println("Not good!");
		}
		
	}

}
