package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		
		
		
		
		boolean b=!true;
		boolean b2=!false;
		
		System.out.println(b);
		System.out.println(b2);
		
		boolean traffic=true;
		// if traffic --> late else --> on time
		
		if(!traffic) { //using ! we are reverting condition
			System.out.println("on time");
		}else {
			System.out.println("late");
			}
		
		
		
		boolean isRain=false;
		
		if(!isRain) {
			System.out.println("Take an umbrella");

		}else {
			System.out.println("Do not take an umbrella");
		}
		
		//lets compare 2 nums using NOT operator 
		int num1=10;
		int num2=11;
		
		if(num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are NOT equal");
		}
		//reverting cond. by using ! 
		if (!(num1==num2)) {
			System.out.println("nums are not equal");
			}else {
			System.out.println("nums are equal");
		}
		//if name is not mary or anna then you are not my sister
		String name="Mary";
		String name2="Anna";
		//true OR false -> true true add not ->false
		if(!(name.equals("Mary") || name.equals("Anna"))) {
			System.out.println("You are not my sister");
		}else {
			System.out.println("You are my sister");
		}
			
			
		}
		
			
		}
	


