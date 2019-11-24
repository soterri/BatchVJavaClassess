package com.class23;

public class Task1 {
	
	
	
	/* write a program that will have a constructor: 
	 * one with parameter and second without any parameters
	 * Create a separate test class where you will execute both constructors
	 * 
	 */

	Task1(){
		System.out.println("Today is JAVA");
	}
	Task1(String str) {
		System.out.println("I am tired of JAVA");
	}
	public static void main(String[] args) {
	
		Task1 obj=new Task1();
		System.out.println("I am not sure what I am doing");
		obj.java();
		
	}
	public void java() {
		System.out.println("Hello world");
		
	}
	public void java(String str) {
		System.out.println("Hello world1");
	}
	
	
	
}
