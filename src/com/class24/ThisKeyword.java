package com.class24;

public class ThisKeyword {

	
	
	
	
	//local vari
	int a, b;
	
	//creating a constructor, thru this constructor will try to initialize parameters
	//instance 
	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
		//wanting to differentiate b/w local and instance use THIS keyword
	}
	public ThisKeyword() { //non argument constructor
		System.out.println("I am non argument constructor");
		
	}
	public void sum(int a, int b) {
		System.out.println("The sum of the local parameters is " +(a+b)); //calc. local variable
		System.out.println("The sum of the  instane variables is " +(this.a+this.b)); //calc instance 
		//still referring to 
		//local variable will need to use this to differentiate 
		//local parameters has  same name as local 
	}
	//creating method 
	public void sayA() {
		System.out.println(a);
	}
	public void sayB() {
		System.out.println(b);
	}
	public void sayAandB() {
		this.sayA();
		sayB();//compilers add this automatically behind the scene comiler will do this.sayB(); 
	}
	// testing the code 
	public static void main(String[] args) {
		//access to instance method, create an object
		ThisKeyword obj=new ThisKeyword(5, 10);
		obj.sum(10,20);
		obj.sayAandB();
		obj.sayA();
		obj.sayB();
		
		System.out.println("**************************");
		ThisKeyword obj1=new ThisKeyword(20, 20);
		obj.sum(100, 200);
		obj.sayB();
		
		//when youre calling your method youre passing the values inta = 10 int b=20 and than passed 10+20
		//instance vari is passed as 15 bc objects 
		//trying to initalize instancce variable this a=a , this b=b
		
	}
}
