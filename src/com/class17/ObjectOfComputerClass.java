package com.class17;

public class ObjectOfComputerClass {

	public static void main(String[] args) {
		
	ComputerClass comp=new ComputerClass();
	comp.brand="Apple";
	comp.name="MacBook Pro";
	comp.keyboard=true;
	comp.screen=15;
	comp.memory=250;
	
	System.out.println("I use a " +comp.brand+ " to study Java with and the screen is " +comp.screen);
	
	}
}
