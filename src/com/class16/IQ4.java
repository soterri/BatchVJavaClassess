package com.class16;

public class IQ4 {
	public static void main(String[] args) {
		
		/*
		 * how to find out the part of the string from a string?
		 * what is a substring?
		 * find the numbers of words in a string?
		 */
		
		String str="Today is very cold outside";
		String subString =str.substring(0, 6);
		System.out.println(subString);
		
		/* step 1: split will return an array of string
		 * we will be splitting based on the space
		 * step 2: find the length of the array
		 * that will give the NUMBER OF STRINGS 
		 */
		System.out.println(str);
		String[] words=str.split(" ");
		System.out.println(words.length);
		
	}

}
