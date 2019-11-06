package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		
		
		//.toChar this method converts this string to a new character array.
		
		String str="Syntax Technologies";
		
		char[] array= str.toCharArray();
		
		for(char i:array) {
			System.out.println(i);
		}
//		char b='w';
//		char c='a';
//		System.out.println(b+c);
	}

}
