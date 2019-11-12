package com.class16;

public class IQ6 {

	public static void main(String[] args) {
		
		
		
		/* write a program to find whether a string is a palindrome or not?
		 * if reversed string and original string are the same --> string is palindrome
		 * mom, dad, racecar, kayak, bob, madam
		 * what will be the logic? 
		 * step 1: reverse the string
		 * step 2: compare 2 strings:
		 * 			if strings are equal -> palindrome
		 * 			else --> not palindrome
		 */
		String original="kayak radar kayak";
		String reversed="";
		
		for(int i=original.length()-1; i>=0; i--) {
			
			reversed=reversed+original.charAt(i); // +k=k+a=ka+k
		}
		System.out.println(reversed);
		
		if(original.equals(reversed)) {
			System.out.println("String is a palindrome ");
		}else {
			System.out.println("String is NOT palindrome");
		}
		
	}

}
