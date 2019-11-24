package com.class18;

public class Task {

	public static void main(String[] args) {
		Task task1=new Task();
		task1.isLarger(10, 50); //argument
		task1.oddOrEven(15); //passing the value aka argument
		task1.oddOrEven(50);
		//task1.paliOrNot();
		
	}
	//create a method that will take 2 parameters as numbers and prints which number is larger
	//method name (2 int type parameters)
			void isLarger(int num, int num1) {
			 if(num < num1) {
				 System.out.println("The larger number is " +num1);
			 }else {
				 System.out.println("The larger number is " +num);
			 }
				
			}
			
			//create a method that will take a number and prints whether the number is even or odd
			void oddOrEven(int a) {
				if(a%2==0) {
				System.out.println("The number " +a+ " is even");
			}else {
				System.out.println("The number " +a+ " is odd");
			}
		}
//			//create a method that will print whether given string is palindrome or not
//			void paliOrNot(String word) {
//				String reverse="";
//				for ()
//				
			}

