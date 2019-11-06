package com.class14;

public class StringSplitMethod {

	public static void main(String[] args) {
		
		
		
		
		//.split();
		//this method splits this string around matches of the given reg. expression
		//splits the following string into array of strings/work
		String str="Video provides a prowerful way to help you prove your point.";
//		System.out.println(str.split(" "));
			String[] array=str.split(" ");
		
			for(int i=0; i< array.length; i++) {
			System.out.println(array[i]);
		}
			System.out.println("**************");
			//how can we find how many sentences are in the following string?
			
			String str1="Today is Sunday. It's a Sunday. And we are having a JAVA class";
			
			String[] array2=str1.split("\\."); // will not print bc the period not reg. expression
			System.out.println(array2.length);
			
			for (String string: array2) {
				System.out.println(string.trim());
			}
			
			
	}

}
