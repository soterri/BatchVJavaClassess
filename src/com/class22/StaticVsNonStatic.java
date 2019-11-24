package com.class22;

public class StaticVsNonStatic {
//creating a template for students (school, name, grade)
	
	static String school="Syntax";
	String name;
	char grade;
	
	//also an instance method bc no static in front of void NON STATIC METHOD 
	void getInfo() {
		System.out.println("My name is " +name+ " and I am going to " 
							+school+ " and my grade is " +grade);
	}
	//static method
	static void getInfo1() {
		System.out.println("I am attending classes at "+school);
		//sysout("My name is" +name);
		//will get compiler error 
		// you CANNOT access NON static members within STATIC methods
	
}
	public static void main(String[] args) {
		/* 
		 * accessing static members within same class
		 * ---> just use name for a variable or call method by its name only
		 */
		System.out.println(school);
		getInfo1();
	}
}
