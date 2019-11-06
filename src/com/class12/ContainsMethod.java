package com.class12;

public class ContainsMethod {

	public static void main(String[] args) {
		
		
		
		
		/*
		 * .contains();
		 *this method searches the sequence of characters in the string.
		 * if the sequences of characters are found,
		 * then it returns true otherwise returns false
		 */
		String sentence="It was raining today";
		String sen="raining";
		System.err.print(sentence.contains(sen));
		//System.err.print)
		
		System.out.println(sentence.contains("was")); // case sensitive! "Was" "was"
		
		// create two strings and initialize them with some value
		//implement the following methods on those strings
		
		
		/*
		*sen.length();
		*sen.equals(); 
		*sen.contains(); 
		*sen.toUpperCase(); 
		*sen.toLowerCase();
		*sen.equalsIgnoreCase(anotherString);
		*/
		
		//task 1 - sen.length();
		String name="Sotheary";
		System.out.println(name);
		System.out.println(name.length());
		
		//task2 sen.lowercase();
		String str1="jOhN is StuPid";
		System.out.println("Before:: "+str1);
		str1=str1.toLowerCase();
		System.out.println("After:: "+str1);
		
		//.equals()
		String str2="heLlo wOrlD";
		
		boolean isEqual=str1.contentEquals(str2);
		System.out.println(isEqual);
		
		//sen.toUpperCase();
		String name1="cHanThaVonG";
		System.out.println("Before:: " +name1);
		name1=name1.toUpperCase();
		System.out.println(name1);
		
		System.out.println("***********");
		
		//.startsWith method
		/*this method tests if a string starts with the 
		 * specified prefix beginning
		 */
		
		String str4="It is very hot in class";
		System.out.println("Does this string starts with= "+str4.startsWith("It"));
		//System.out.println("Is this string starts with= "+str4.startsWith("is", 3));
		
		/* .endsWith method
		 * this method tests if this string ends with
		 * the specified suffix
		 */
		System.out.println("Does this string ends with= "+str4.endsWith("class"));
		
	}

}
