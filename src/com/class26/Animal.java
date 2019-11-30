package com.class26;

public class Animal {
	//as a parent class we can add features 
	
	public void sleep() {
		System.out.println("Animal sleep");
	}
	public void eat() {
		System.out.println("Animal eat");
	}
	
}

class Cat extends Animal{
//as a child we can have access to all properties

	public void sleep() {
		System.out.println("Cats sleep all day");
	}
	public void meow() {
		System.out.println("I meow when I'm hungry");
	}
	public void eat() {
		System.out.println("Cat eats mouse");
	}
}
