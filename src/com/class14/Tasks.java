package com.class14;

public class Tasks {

	public static void main(String[] args) {
			/*
			 * tasks 1 
			 * create a string that will hold a sentence. 
			 * write a program to get a new string without any spaces
			 */

			String str="Hello, my name is Terri";
			System.out.println(str.replace(" ", ""));
			
			 /*task 2
			 * create a string that should be combo of letter, #'s, chars,
			 * find out how many alpha char are there in the string
			 */
			
			
			
			/*
			 * task 3
			 * 3.You have a String a=”Is it saturday? Is it raining? Do we have a Java Class 
			 *today?” How would you find out how many sentences are in that String? 
			 */
		
			String str4="Is it Saturday? Is it raining? Do we have a JAVA Class today? How would you find"
					+ "out how many sentences are in that String";
			
			String[] array=str.split("\\?"); // will not print bc the period not reg. expression
			System.out.println(array.length);
			
			for (String string: array) {
				System.out.println(string.trim());
			}
			
	}

}
