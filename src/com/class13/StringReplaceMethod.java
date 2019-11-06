package com.class13;

public class StringReplaceMethod {

	public static void main(String[] args) {
		
		/* .replace(); method
		 * ths method returns a new string resulting from
		 * replacing all occurrences of oldChar in this string w/ newChar
		 */
		
		String str="Hello Dear, how are you? How have you been?";
		String str1="12-22-1990"; //in the database it displays as 12/22/1990
		System.out.println(str1.replace('-','/'));
		//if wanting to replace the first dash
		//System.out.println(str1.replaceAll("-", "/")); too difficult to use? idk Sohil didn't really 
		//explain it 
		
		/* .replace(); method
		 * ths method returns a new string resulting from
		 * replacing all occurrences of SEQUENCES oldChar in this string w/ newChar
		 */
		
		System.out.println(str.replace('e', 'z')); 
		// the tricky part is looking for all occurrences of E 
		//before replacing with Z so it will change all characters
		
		System.out.println(str.replace("Dear", "Respected"));
		System.out.println(str.replace("Dan", "Ali"));
		System.out.println(str.replaceFirst("Dan", "Ali"));
		
	
	
	}

}
