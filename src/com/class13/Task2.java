package com.class13;

public class Task2 {

	public static void main(String[] args) {
	
		
		
		//create a string and if the string is not empty, perform the following:
				//if the string has an odd number of characters and has 3 or more characters
				//print the character in the middle of the string
			
				String str1="Hello";
				
				int middle=str1.length()/2;
				
				if(!str1.isEmpty()) {
					if(str1.length()%2!=0 && str1.length()>=3) {
						System.out.println(str1.charAt(middle));
						
				//int a=5%2;
				//Sysout(a);
					

	}
				}
}
}