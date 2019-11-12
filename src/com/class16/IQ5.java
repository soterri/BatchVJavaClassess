package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		
		/* write a java program to reverse the string
		 * reverse a string word by word
		 */

		String given="Welcome to Java Class";
		// REVERSE A STRING WORD BY WORD
		
		/* to REVERSE string
		 * step 1: use SPLIT and than will get array of strings
		 * step 2: use loop for loop and use decrement to print values
		 */
			String reversed="";
	        String[] str=given.split(" ");
	        for (int i =str.length-1; i>=0; i--) {
	        	reversed=reversed+str[i]+" ";
	        }
	            System.out.print(reversed);
	            
	     // WRITE A JAVA PROGRAM TO REVERSE THE STRING
	    // toCharArray(); charAt(); 
	            
	        String str1="Today is Java Class";
	        char[] charArray=str1.toCharArray();
	        for (int i=0; i>=0; i--) {
	        	System.out.println(charArray[i]);
	        }
	       
	        // CHARAT(); METHOD
	        String str3="I love Java Class";
	        for (int j=str3.length()-1; j>=0; j--) {
	        	System.out.print(str3.charAt(j));
	        }
	        
	        }
	}

