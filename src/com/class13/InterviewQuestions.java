package com.class13;

public class InterviewQuestions {

	public static void main(String[] args) {
		
	
		
		// WRITE A JAVA PROGRAM TO FIND THE LARGEST NUMBER IN THE ARRAY? MAX AND MIN IN THE ARRAY
		
		int arr[] = { 15,60,89,70,55,9,53 };
		int largest = arr[0];
		int secondLargest = arr[0];
		int smallestNum = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}else if (arr[i] < smallestNum) {
				smallestNum = arr[i];
				
			}
			}
		System.out.println("The largest number in the array is: " +largest);
		System.out.println("The second largest number in the array is: " +secondLargest);
		System.out.println("The smallest number in the array is: " +smallestNum);
			}
		
	
		
		//The following program required for us to use the object of Array which is a "container" that holds
		//constant numbers of values of the same type. The for loop, a control flow statement
		//that iterates a part of the programs multiple times was also used in this program. And lastly the if 
		//statement which is used to test the condition.
		
		
		

	}


