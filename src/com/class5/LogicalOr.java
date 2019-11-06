package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		
		
		
		//7 days a week
		//if days is 2 or 4 (tues/thurs) -> SDLC
		//if days is 6 or 7 (sat/sun) -> JAVA 
		//if day is 1 or 5 -> no class
		//if day =3 -> review class
		
		int day=6;
		 if (day==2 || day==4) {
			System.out.println("SDLC Class");
		}else if(day==6 || day==7) {
			System.out.println("Java Class");
		}else if(day==1 || day==5) {
			System.out.println("No class");
		}else if(day==3) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a Valid Day");
			
			
			
		}

	}

}
