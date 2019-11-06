package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		
		String str="12345Hello546547545454";
		System.out.println(str.replaceAll("[0-9]", "")); //leaves only texts
		System.out.println(str.replaceAll("[a-zA-Z]", "")); //leaves only numbers
		
		//remove everything but the text & numbers
		String str2="Hi$^%&%&How$%$^are5454are97you";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", "")); //the ^ removes the jibberish
		
		//System.out.println(str2.replaceAll("\\w", "")); irrelevant
		
		
		
	}

}
