package com.class5;

public class LogicalTaskAgain {

	public static void main(String[] args) {
		
		
		
		
		/*declare the time 1-24
		 * based on the time identify whether its am, qnoon, qpm
		 * if 1-11 am 
		 * if 12-15 noon
		 * if 16-20 evening
		 * if >20 night
		 */

		int time=18; //declaring variable assigning value
		String timeOfDay=null; //just declaring not assigning
		
		if (time>=1 && time<=11) { // based on this condition
			timeOfDay="Morning"; //assigning value its empty
		}else if (time>=12 && time<=15) {
			timeOfDay="Noon";
		}else if (time>=16 && time<20) {
			timeOfDay="Evening";
		}else if(time>20) {
			timeOfDay="Night";
		}else {
			timeOfDay="Invalid";
			}
		System.out.println("Time of the day is " +timeOfDay);
		
		if(timeOfDay.equals("Evening")) {
			System.out.println("Good PM");
			
			//use null as empty as no value null; 
			//in java ALL local variables must be initialized before using them!! 
			//default value of int --> 0 double -->0.0 boolean --> false String --> null 
			//
			
			
		}
	}

}
