package com.class6;

public class DoWhile {

	public static void main(String[] args) {
		//majority used is while
		int num=1;
		while (num<=7) {
			System.out.println("Hello");
			num++;
			}
		//rare to the "do"
		int num1=1;
		do {
			System.out.println("bye");
			num1++;
			
		}while (num1<=7);
		
		//print out even numbers from 20 to 50 using do while
		
		int even=20;
		do {
			System.out.println(even);
		
			even+=2;
		}while (even<=50); 

		//2 ways
		
		int even1=20;
		do {
			if(even1%2==0) {
				System.out.println(even1);
			}
				even1++;
		}while(even1<=50);
		
	}


}

			
		
	
		

	

