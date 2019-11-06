package com.class6;

public class LoopTasks {

	public static void main(String[] args) {
		/*create a boolean variable work day and assign true
		 * create int variable day and assign it to 1
		 * as long as it is workday print "I need a day off" and increase day
		 * once day is a 6 or 7 print "I do not need a day off any more"
		 */
		
		boolean workDay= true; // we need two variables in this task BOOLEAN AND INT
		int day=1; //initalization
		
		while(workDay) { // what is the value of the workday? TRUE wanna keep looping
			//now opening loop while body
			System.out.println("I need a day off");
			//before incrementing we checking the wording and our day
		if (day==6) {
			System.out.println("I do not need a day off");
			workDay= false;
		}
			day++; // we need to keep incrementing the day by ++
			
	
	}

}
	}

// boolean workDay = true;
//int day=1;
//while (workDay){
//if (day==6){
//workDay= false;
//System.out.println("I do not need a day off anymore");
//}else {
//System.out.println("I need a day off");
//}
//day++;
