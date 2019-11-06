package com.class13;

public class TasksStringManip {

	public static void main(String[] args) {
		
		
		
		//create a string and print it in reverse (Sunday --> yadnuS)
		
		String day="Sunday";
		
		for(int i=day.length()-1; i>=0; i-- ) { //the -1 is to deduct since the index of sunday says 6 
			//buts its 5 since indexes start at 0
			
		System.out.print(day.charAt(i));
		
		//System.out.println(day.length()); - always provides +1 
		
		//String day="Sunday";
		//System.out.println(day.charAt(4)+" " +day.charAt(5)+" " repeat); tooo long 
		
		
		
		}
		
		
		}

	
	}

