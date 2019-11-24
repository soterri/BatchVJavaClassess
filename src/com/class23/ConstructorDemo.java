package com.class23;

public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("I am your constructor");
	}
	
	ConstructorDemo(String str){
		System.out.println("I am constructor with 1 parameter "+str);
	}
	ConstructorDemo( int num) {
		System.out.println("I am constructor with 1 parameter "+num);
	}
	ConstructorDemo( int num, int num1){
		System.out.println("I am constructor with 2 int parameter " +num);
	}
	
public static void main(String[] args) {
	
	ConstructorDemo obj=new ConstructorDemo();
	System.out.println("Code after creating an Object");
	obj.hello();
	
	//ConstructorDemo obj2=new ConstructorDemo("My Parameter");
	ConstructorDemo obj2=new ConstructorDemo(123, 345); 
}
public void hello() {
	System.out.println("Hello Class");
	System.out.println("Hello Instructors");
}
public void hello(String str) {
	System.out.println("Hello Class1");
	System.out.println("Hello Instructors1");
}
}
