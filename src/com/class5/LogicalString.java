package com.class5;

public class LogicalString {

	public static void main(String[] args) {
		
		
		
		
		//7 days a week
		//if days is 2 or 4 (tues/thurs) -> SDLC
		//if days is 6 or 7 (sat/sun) -> JAVA 
		//if day is 1 or 5 -> no class
		//if day =3 -> review class
		
		String weekDay="Sunday";
		
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC Class");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No class");
		}else if (weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
			
			
			
		}

	}

}
