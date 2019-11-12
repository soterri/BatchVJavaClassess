package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		
		/* write a java program to check whether a given number is prime or not?
		 * prime: is a number that has to meet 2 conditions:
		 * it should be divisible by 1 and by itself only
		 * 2, 3, 5, 7, 11, 13, 17, 19
		 */
		
		//take a range of numbers from 2 to 100 and print all prime
		// taking 2 and 3 , checking if divisible by 2,3 and so on
		//2,3 (2,3), 4 (2,3,4), 5(2,3,4,5) 6(2,3,4,5,6)
		
		int num =5;
		
		boolean isPrime=true;
		
		if(num ==0 || num==1) {
		//if(num !=0 && num!=1) {
			isPrime = false;
			
		}else {
		
		for( int i=2; i< num; i++) {
			
			if (num%i==0) {
				isPrime=false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num+ " is a Prime number");
		}else {
			System.out.println(num+ " is NOT a Prime number");
		}
		}
	}
}

		
	
