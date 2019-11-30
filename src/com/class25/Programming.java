package com.class25;

public class Programming {
	
	//create a class named ‘Programming’. While creating an object of the class, if nothing is passed to it, 
	//then the message “I love programming languages” should be printed. If
	//some String is passed to it, then in place of “programming languages” the value variable should
	//be printed. Example, if we pass “Java”, then “I love Java” should be printed
    
	private void Programming() {
		System.out.println("I love programming languages");
	}
	private void Programming(String str) {
		System.out.println("I love" +str);
		}
	public static void main(String[] args) {
		
		Programming obj=new Programming();
		obj.Programming("I love programming");
		obj.Programming("Java");
	}
}
