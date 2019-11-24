package com.class23;

public class Car {
	/* we want to build Toyota cars that will have different models and colors
	 * 
	 */
	
	//step 1. building the template features/attributes
	
	static String make; //using the static is specifying non access modifiers showing that the variable belongs to the class
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	
	public void getDetails() {
		
		System.out.println("I build "+color+" " +make+ " "+model);
		System.out.println("My car has  "+doors+ " and can have speed up to "+speed);
	}
	
	

}
