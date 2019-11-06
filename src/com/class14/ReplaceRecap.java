package com.class14;

public class ReplaceRecap {

	public static void main(String[] args) {
	
		
		
		
		String str="Hello";
		String str3="Hello";
		System.out.println(str==str3);
		
		System.out.println("******************");
		
		String s1="hello";
		String s2="Hello";
		System.out.println(s1==s2);
		
		String str1=new String("Hello");
		System.out.println(str);
		String str2=str.replaceAll("Hello", "Bye");
		System.out.println(str2);
	}

}
