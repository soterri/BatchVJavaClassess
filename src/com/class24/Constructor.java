package com.class24;

public class Constructor {

	
	
	//public Constructor() {
		//System.out.println("hello");
		
		void Constructor(){
		System.out.println("Hello"); //will treat as method bc of VOID method execution does not happen auto use obj.
	}
		public Constructor() {
			System.out.println("I am constructor");
		}
	//if try to add return type -> will get a compiler error
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		obj.Constructor();
		
		
	}
}
