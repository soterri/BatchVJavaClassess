package com.class19;

public class MethodWithReturnValue {

	public static void main(String[] args) {
		/* declare a string and if String has more than 10 characters --> String is large
		 * otherwise ---> string is small 
		 * to find how many character --> str.length();
		 */
		
		String str="Welcome home";
		int numOfChars=str.length(); // when you calling the method length from the string class
		//this method RETURNS something.. this case RETURNS a numeric value
		
		if(numOfChars>=10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		char character=str.charAt(4);
		System.out.println(character);
		
		//create an object of the class where the method is defined
		Recap19 obj=new Recap19();
		//int num=obj.sum(10, 30); //compiler error saying change return type
		obj.sum(10,20);
		
		MethodWithReturnValue obj1 = new MethodWithReturnValue();
		int sum=obj1.sum(50, 50);
		System.out.println(sum);
		int large=obj1.findLargest(20, 40);
		System.out.println(large);
	}
	//return type, method name, (list of parameters)
	int sum(int num1, int num2) {
		int c=num1+num2; 
		return c; 
		// how can we call this method? -->  ^^^^^^^^^
		
	}
	// create a method to return the largest number
	//void findLargest(int num1, int num2) { // will not return anything bc VOID!
		int findLargest(int num1, int num2) {
		int largest;
		if(num1>num2) {
			largest=num1;
		}else {
			largest=num2;
		}
			return largest;
		}
		//System.out.println("Largest number is " +largest); will NOT return anything bc its not RETURN
		//how are we going to execute this method? 
		//we will need to CALL IT! by creating an obj! change VOID into INT and instead of sysout change to 
		//RETURN!
	}

