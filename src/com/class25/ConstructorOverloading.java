package com.class25;

public class ConstructorOverloading {
	
	
	//different amount of parameters
	ConstructorOverloading(){
		System.out.println("I am non argument constructor");
	}
	ConstructorOverloading(String str){
		System.out.println("I am constructor with 1 string parameter");
	}
	// having different types of parameters
	ConstructorOverloading(int num){
		System.out.println("I am constructor with 1 int parameter");
	}

}
