package com.class22;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		//how can we access variable name? 
		//use OBJECT
		//how can we access breed? line 13 or by obj ref
		
		Husky obj=new Husky();
		System.out.println(obj.name);
		obj.name="Sharik";
		System.out.println(obj.name);
		
		System.out.println(Husky.breed);
		Husky.breed="New Breed"; // to use other than husky
		System.out.println(obj.breed);//poss. but not preferable
		
	}
}
