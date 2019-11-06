package com.class12;

public class StringManipEmpty {

	public static void main(String[] args) {
	
		
		
		
		/*this method checks whether a string is empty or not
		 * this method returns true if the given string
		 * is empty, else it returns false
		 */
		
		String str="";
		System.out.println("Is this method empty? "+str.isEmpty());
		String str1="Hello";
		System.out.println("Is this method empty? "+str1.isEmpty());
		
		System.out.println();
		
//		if(!str.isEmpty()) {
//			System.out.println("This is not empty");
//		}else {
//			System.err.println("This is an empty String");
//			
//		}
		String sentence="Each day has a promise to brighten up the day, \nbut first you may allow the sun to come your way";
		System.out.println(sentence); 
		// when using a LONG SENTENCE use \n to get the other part of the sentence into the next line
		// \t will give you a tab
		
		System.out.println("***************");
		
		/*this method appends one string to the end of another
		 * this method returns a string with the value of the 
		 * string passed in to them method appended to the end
		 * of the string used to invoke this method
		 * STRING CONCAT METHOD
		 */
		
		String str3="Hello ";
		String str4="World";
		String str5="People";
		System.out.println(str3+str4+str5);
		System.out.println(str3.concat(str4).concat(str5));
		System.out.println(str4+str3+str5);
		// these are the options on which to print 
		
		System.out.println("**************");
		/* 
		 * STRING TRIM METHOD
		 * this method returns a copy of the string,
		 * with leading and trailing whitespace omitted.
		 */
		String str6=" How are you? ";
		System.out.println(str6.trim());
		
		/*
		 * CHAR AT METHOD
		 * this method returns the character located at the Strings 
		 * specified index
		 * the string indexes start from zero 
		 */
		String str7="We might be done early today";
		System.out.println(str7.charAt(14)); // to locate the letter 
		
		System.out.println("******************");
		
		/*INDEX OF METHOD
		*this method returns the index within this string of the
		*first occurrence of the specified character or -1
		*if the character does not occur
		*/
		String str8="We might mnot be done early";
		System.out.println(str8.indexOf('m')); 
		//now if we have multiple same letters will use this method below
		System.out.print(str8.indexOf('m', 12)); //return a -1 bc the character is not there
		System.out.println(str8.indexOf('z', 0));
		
	}

}
