package com.class24;

public class Test {

	public static void main(String[] args) {
		
		Child1 child1=new Child1();
		System.out.println(Child1.race); //Child1 bc static 
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sing();
		child1.code();
		
		Parent parent = new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(parent.race);
		parent.sing();
		//parent.code(); // will get compiler error
		//bc as a PARENT you cannot access CHILD feat
		//how can we access static member?
		//name of class! 
		
		Child2 child2=new Child2();
		System.out.println(Child2.race);
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		child2.sing();
		child2.code1();

	}

}
