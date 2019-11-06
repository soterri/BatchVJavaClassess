package com.class12;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		
		//Scanner s=new Scanner(System.in);
		
		//String str=new String();
		
		//there are two ways to create string objects
		
		//1. string literal
		String name="John";
		System.out.println(name);
		System.out.println("The length of name is "+name.length());
		
		//2. creating string with new keyword
		String name1=new String("John1");
		
		
		/* this method returns the length of this string.
		 * the length is equal to the number
		 * of 16 bit unicode characters in the string
		 */
		int name1Len=name.length();
		System.out.println("The length of name1Len is: "+name1Len);
		
		String str1="HelLo woRld";
		System.out.println("Before:: "+str1);
		str1=str1.toLowerCase();
		System.out.println("After:: "+str1);
		
		//.equals()
		String str2="heLlo wOrlD";
		
		boolean isEqual=str1.contentEquals(str2);
		System.out.println(isEqual);
		
		//.equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//upper case changing everything to upper case
		String str3="Sotheary";
		System.out.println("Before:: "+str3);
		str3=str3.toUpperCase();
		System.out.println("After:: "+str3);
		
		
		
		
		

	}

}
