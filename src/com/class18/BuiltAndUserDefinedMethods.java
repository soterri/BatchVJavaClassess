package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		// buolt in methods comes in JAVA library, can simply reuse it 
		// us as users 
		String str="Hello"; // referring to our object 
		str=str.replace("Hello", "Hi"); //replace is a built in method
		System.out.println(str); 
		
		Scanner scan=new Scanner(System.in);
		String scannerString=scan.nextLine(); // also a built in method
		System.out.println(scannerString);
		
		BuiltAndUserDefinedMethods obj= new BuiltAndUserDefinedMethods();
		obj.myMethod();
		
	}
		void myMethod() { //method header - anything that inside the curly braces is the method body 
			System.out.println("This is user defined method that I created"); // when you write your own method
			//it needs to be outside of your block
		}
		

	}


