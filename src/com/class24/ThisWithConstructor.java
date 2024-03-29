package com.class24;

public class ThisWithConstructor {

	
	//CREATING 2 CONSTRUCTORS WITH NO ARGUMENTS and ARGUMENTS
	
	ThisWithConstructor(){
		System.out.println("I am non arugment constructor");
	}
	ThisWithConstructor(String str){ //creating with parameters
		this();// used to call current class constructor // not passing any values 
		System.out.println("I am constructor with 1 String parameter");
		
	}
	//passing 2 strings
	ThisWithConstructor(String str, String str1){
		//this(); always must be a first statement! and only used once in each constructor
		this(str); //as soon as you use THIS.. compilers know you're trying to make constructor call
		System.out.println("I am constuctor with 2 parameters");
	}
	
	public static void main(String[] args) {
		//ThisWithConstructor obj=new ThisWithConstructor(); // will get executed with non argument cons
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		
		//can we EXECUTE 2 CONSTRUCTORS at the same time?
		//YES! it can be acheived using THIS() 
		
		ThisWithConstructor obj1=new ThisWithConstructor("Hello", "Bye");
		
	}
}
