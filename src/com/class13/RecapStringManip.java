package com.class13;

public class RecapStringManip {

	public static void main(String[] args) {
		
		
		
		// STRING LITERAL AND STRING new KEYWORD
		String str1="Hello";
		String str2="Hello";
	
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1==str2);
	
		String str3=new String("Bye");
		String str4=new String("Bye");
		System.out.println(str3.contentEquals(str4));
		System.out.println(str3==str4);
		
		System.out.println(str1.contains("yo")); 
		
		System.out.println("*****StartsWith and EndsWith*******");
		
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		
		System.out.println("*****Concat*******");
		System.out.println(str5.concat(" and we have Java Class"));
		
		
		System.out.println("*****trim*******");
		String str6 ="      It is sunny";
		System.out.println("Before triming: " +str6);
		System.out.println(str6.trim());
		
		System.out.println("*****Index Of and CharAt*******");
		String str7="Tomorrow we will be done with String Manipulation";
		//want to find the value of the indexes
		System.out.println(str7.indexOf('e')); // will only find the first occurence of the 'e'
		System.out.println(str7.indexOf('e', 11)); // to find the next 'e' from the 11 index (after the 10)
		System.out.println(str7.indexOf("we"));
		System.out.println(str7.charAt(10));
		
		
		
		
		
		
		

	}

}
