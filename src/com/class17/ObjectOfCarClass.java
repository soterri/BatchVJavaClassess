package com.class17;

public class ObjectOfCarClass {
	
	public static void main(String[] args) {

	// WILL START BUILDING OBJECTS HERE
	// TO CREATE AN OBJECT SYNTAX IS:
	//ClassName anyVariableName=new ClassName(); 
	
	//class name --- "new" creates new objects
	//so now we are building the object of the class
	car car1=new car();
	car1.make="Tesla";
	car1.model="S";
	car1.color="Black";
	car1.year=2020;
	car1.wheels=4;
	car1.windows=5;
	car1.speed=200;
	
	car1.start();
	car1.accelerate();
	car1.drive();
	
	//if we wants to build a 2nd car 
	car car2=new car();
	car2.make="BMW";
	car2.model="i8";
	car2.color="Purple";
	car2.year=2019;
	car2.wheels=4;
	car2.windows=6;
	car2.speed=600;
	car2.make="Toyota";
	//accessing behavior for 2 objects
	car2.drive();
	car2.start();
	car2.accelerate();
	
	
	//lets PRINT feats of the car
	//I have a black Tesla 
	System.out.println("I have a " +car1.color+ " " +car1.make);
	System.out.println("I drive a "+car2.make+" "+car2.year);

	}
}
