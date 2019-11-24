package com.class19;

public class TestAllMethods {
	public static void main(String[] args) {
		//find the largest number from 300 and 500
		//then identify if the largest number is odd
		// first create an OBJECT.. we will simply reuse the method from ALL METHODS CLASS 
		//we will than need to use ALL METHODS OBJECT 
		
		AllMethods obj=new AllMethods();
		int large=obj.findLargest(300, 500); //whenever we call this method it will return one largest value
		System.out.println(large);
		boolean odd=obj.isOdd(large);
		System.out.println(odd);
		
		//call method weekdayname 
		//if method returns tues, weds, thurs,
		//sat, sun --> I am learning Java
		
		String day=obj.weekDayName(5);
		if(day.equals("Tuesday") || day.equals("Weds") 
			|| day.equals("Thurs") || day.equals("Sat") 
			|| day.equals("Sun")) {
			System.out.println("I am learning Java");
		}else {
			System.out.println("I am practicing Java");
		}
		
		
		
		
	}

}
