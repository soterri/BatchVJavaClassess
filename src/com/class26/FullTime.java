package com.class26;

public class FullTime extends Employee {
	//as a CHILD CLASS - SUB CLASS - creating our own feats
	//as a child class overriding a method in parent class
	int bonus;
	
	public void getPaid() { //over riding
		System.out.println("Full time employee gets paid " +salary+ " and bonus " +bonus);
	}
	
}
