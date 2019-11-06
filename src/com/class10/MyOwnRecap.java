package com.class10;

import java.util.Scanner;

public class MyOwnRecap {

	public static void main(String[] args) {
		/*write a program that reads a range of integers
		 * start and end point provided by a user and then 
		 * from that range prints the sum of even and odd integers
		 * in this program we are going for FOR LOOP 
		 * short to get scanner = shift control  o
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter start number");
		int start=scan.nextInt();
		System.out.println("Enter End Number");
		int end=scan.nextInt();
		
//		int start =0;
//		int end=0;
//		
//		if(firstNumber<secondNumber) {
//			start = FirstNumber;
//			end = SecondNumber;
		//}else{
		//if(secondNumber<firstNumber){
		// start=secondNumber;
		//end=firstNumber;
		
			
		int even=0;
		int odd=0;
		
		for (int i=start; i<=end; i++) {
			if(i % 2 ==0) {
				even = even +i;
			}else {
				odd = odd + i;
			}
		}
		System.out.println("The sum of even nums is: "+even);
		System.out.println("The sum of of off nums is: "+odd);
	}
}
