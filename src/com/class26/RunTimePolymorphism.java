package com.class26;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		//creating an obj of parent class
		Animal animal=new Animal();
		animal.sleep();
		animal.eat();
		System.out.println("********************");
		//creating an obj of child clas
		Cat cat=new Cat();
		cat.eat(); //from parent class
		cat.meow(); //from child 
		cat.sleep(); //from child 
		
		
		//TYPECASTING IN JAVA --> CHANGING ONE TYPE TO ANOTHER TYPE
		// IMPLICIT - WIDENING / AUTOMATICALLY
		//EXPLICIT - NARROWING/ MANUALLY
		//PRIMITIVES -- BYTE->SHORT->INT->LONG 
		//NON PRIMITIVES 
		
		//widening
		double d=90;
		//narrowing
		int i=(int)1.99;
		System.out.println("***************");
		//NON-prim typecasting
		//widening -> creating an obj of the child class
		//and giving reference to the parent class
		Animal obj=new Cat();
		//narrowing
		//Cat obj2=new Animal(); cant convert animal to cat
		obj.sleep(); //comes from child class - acheiving runtime polymorphism
		obj.eat();
		//obj.meow(); compiler err bc method not available
		
		}
		
	}

