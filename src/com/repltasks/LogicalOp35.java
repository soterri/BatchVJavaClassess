package com.repltasks;

import java.util.Scanner;

public class LogicalOp35 {

	public static void main(String[] args) {
		
				//Prompt user to input two strings : "Please enter two strings"and two integers: 
				//"Please enter two numbers"  
				//and make the comparisons:
				//if int1 and int2 are equal and word1 and word2 are equal, output "AND"
				//if int1 and int2 are equal or word1 and word2 are equal, output "OR"
				//if int1 and int2 are not equal and word1 and word2 are not equal,
				//output "NONE"
				
		String oneString, twoString;
		int num1, num2;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two strings");
		oneString=scan.nextLine();
		twoString=scan.nextLine();
		
		System.out.println("Please enter two numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		
		if(oneString.equals(twoString) && num1==num2) {
			System.out.println("AND");
			
		}else if(oneString.equals(twoString) || num1==num2) {
			System.out.println("OR");
			
		}else {
			System.out.println("NONE");
			
			
		}
		
	}
	}


