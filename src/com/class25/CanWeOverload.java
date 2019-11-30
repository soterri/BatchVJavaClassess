package com.class25;

public class CanWeOverload {
	
	//can we overload a private method?
	
	private void methodOne() {
		System.out.println("I am method one");
	}
	private void methodOne(String str) {
		System.out.println("I am method one with " +str);
	}
	// can we overload a MAIN method? - yes
	//can we overload a static method? - yes bc its main method

	public static void main(String str) {
		System.out.println("I am a main method with String parameters/arguments");
		//if you want to print this method.. call from class by doing MAIN("STRING); 
		//ACCESS IT BY CALLING THEIR NAME 
	
	}
	public static void main(String str, String[] arg) {
		System.out.println("I am main method with 2 parameters");
	}
	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		CanWeOverload.main("String");
		String[] array= {"A", "B"};
		main("Hello", array);
	}
}
// will execute with "string array" bc java will look at METHOD SIGNATURE main method