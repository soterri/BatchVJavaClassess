package com.class3;

public class IfElseRecap {

	public static void main(String[] args) {
		
		
		
		
		/* Class schedule
		 * if tues --> sdlc
		 * if weds --> java review
		 * if thurs --> sdlc
		 * if sat --> java coding
		 * if sun --> jmy fav java coding 
		 */
		int day;
		day=4;
		if(day==2) {
		System.out.println("SDLC Class");
		} else if(day==3) {
		System.out.println("Review Class");
		}else if(day==4) {
		System.out.println("SDLC Class");
		}else if(day==6) {
		System.out.println("Java Class");
		}else if (day==7) {
		System.out.println("Fav Java Class");
		}else {
		System.out.println("There is no class");
		}
		
	}
	
}