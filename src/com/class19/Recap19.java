package com.class19;

public class Recap19 {

	// if you want to create a sum of 2 numbers
	void sum(int num1, int num2) {
		int c=num1+num2; 
		System.out.println("The sum of two numbers = " +c);
	}
	
	//create a method to display hello 5x
	void sayHello(int times) {
	for(int i=0; i<times; i++) {
	System.out.println("Hello");	
	}
	}
	// create method to say something a # of times 
	void saySomething(String word, int times) {
		for (int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
	
	public static void main(String[] args) {
		Recap19 obj=new Recap19();
		obj.sum(10, 30);
		System.out.println("---------");
		obj.sayHello(1);
		obj.saySomething("Java", 5);
		
	}
}


