package com.class22;

public class InstanceVariables {
	
	String name="Samir";
	
	public static void main(String[] args) {
		//this is a local variable to the method
		String name="Burcu";
		System.out.println(name); 
		//it wont print SAMIR bc it belongs to the class and will print Burcu 
		//bc it is in the main method body 
		//now to print Samir, you will need to create an obj 
		InstanceVariables obj=new InstanceVariables();
		System.out.println(obj.name);
		//changing the value of the instance variable
		obj.name="John";
		System.out.println(obj.name);
		// the value will be samir bc everytime an object will copy the instance variable and pass it on
		//creating a new instance of class InstanceVariables 
		InstanceVariables obj1=new InstanceVariables();
		System.out.println(obj1.name);
	}

}
