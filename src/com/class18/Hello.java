package com.class18;

import java.util.jar.Attributes.Name;

public class Hello {

	//how do we create a method? VOID! 
	
	void sayHello(String name) {
		
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
		
		Hello obj=new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguages("USA");
		obj.sayHelloDifferentLanguages("CAMBODIA");
		obj.sayHelloDifferentLanguages("LAOS");
		obj.sayHelloDifferentLanguages("ParaGuay"); 
		//obj.sayHelloDifferentLanguages(123) -> will get compiler error 
		obj.sayNameAndAge("Jack", 45);
		obj.sayNameAndAge("Olga", 50);
		obj.isSnowing(true);
		obj.isSnowing(false);
		obj.isLarger(20, 40);
		obj.oddOrEven(15);
		
		
	}
	/*create a method that will say hello in different languages based
	 * on the value that will be passed when user calls a method
	 */
	
	
		
		//String country="USA"; we hard coded the value so it wont print properly
		//will use the SWITCH case bc we will be providing mult conditions
		// will need to use parameter below 
		
	
		void sayHelloDifferentLanguages(String country) {
		
		switch(country.toLowerCase()) { //to match it everything needs to be in lower case
		
		case "usa":
			System.out.println("Hello");
			break;
			
		case "cambodia":
			System.out.println("Sok Sa Bai");
			break;
		
		case "laos":
			System.out.println("Sa Bai Dee");
			
		case "paraguay":
			System.out.println("hola");
			break;
			
		default:
			System.out.println("I do not know how to say hello in your language");
		}
		}
		//CREATE A METHOD TO SAY NAME AND AGE
		//instead of hardcoding, we can pass this value as a parameter
		void sayNameAndAge(String name, int age) {
			//System.out.println("My name is Terri and I am 29 years old");
			System.out.println("My name is "+name+" and I am "+age+ "years old");
		}
		// create a method that will say check if it's snowing 
		// if snowing --> stay at home otherwise --> go for a walk
		
		void isSnowing(boolean isSnowing) { //method header.. the isSnowing is the name of our method
			//and we also have our parameter .. the parameter in this case is boolean 
			//and below is our method body
			//method can have different types of parameters (can be a mix of boolean, string, int etc)
			//method can be unlimited 
			if(isSnowing) {
				System.out.println("Stay home");
			}else {
				System.out.println("Go for a walk");
				
			}
		}
		//create a method that will take 2 parameters as numbers and prints which number is larger
		void isLarger(int num, int num1) {
		 if(num < num1) {
			 System.out.println("The larger number is " +num1);
		 }
			
		}
		
		//create a method that will take a number and prints whether the number is even or odd
		void oddOrEven(int a) {
			if(a%2==0) {
			System.out.println("The number " +a+ " is even");
		}else {
			System.out.println("The number " +a+ " is odd");
		}
	}
		//create a method that will print whether given string is palindrome or not
		void paliOrNot() {
			
		}
}

