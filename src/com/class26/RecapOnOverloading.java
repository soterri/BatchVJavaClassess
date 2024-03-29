package com.class26;

public class RecapOnOverloading {

	/* POLYMORPHISM 
	 * compile time/static binding/early binding
	 * KEY POINTS - we can overload static methods, overload private methods, and constructors too
	 * operator overloading (+) with strings
	 * with strings behaves as concatenation operator
	 * with numbers --> behaves as math operator
	 * 
	 */
	
	public void hello() {
		System.out.println("Hello");
	}
	
	public void hello(String str) { 
		System.out.println("Hello" +str);
	}
	
	public void hellp(int num) { //not overloading
		System.out.println("Hello" + num);
	} 
	public String hello1(String str) { // not overloading
		return str;
	}
	public static void main(String[] args) {
		RecapOnOverloading obj=new RecapOnOverloading();
		obj.hello();
		obj.hello(" I is me");
	

	}
}
