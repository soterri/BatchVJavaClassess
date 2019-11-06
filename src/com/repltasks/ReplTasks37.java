package com.repltasks;

import java.util.Scanner;

public class ReplTasks37 {

	public static void main(String[] args) {
			/*Take 2 boolean inputs from a user:
			 
			*"Are you thirsty?"
			*"Are you sleepy?"

			*If user is thirsty and not sleepy--> drink=Water
			*If user is thirsty and sleepy--> drink=Coffee
			*If user is not thirsty and sleepy --> drink=Tea
			*Otherwise drink="Nothing"

			*Output:
			"Looks like you need ___ "*/
		
		boolean isThirsty, isSleepy;
		String drink; 
		
		Scanner scan=new Scanner(System.in);
			System.out.println("Are you thirsty?");
		isThirsty=scan.nextBoolean();
			System.out.println("Are you sleepy?");
		isSleepy=scan.nextBoolean();
		
	
		if(isThirsty==true && isSleepy==false) {
			drink = "water";
		}else if(isThirsty==true && isSleepy==true) {
			drink = "coffee";
		}else if(isThirsty==false && isSleepy) {
			drink = "tea";
		}else {
		  drink = "nothing";
		}
		System.out.println("Looks like you need " +drink);
		
		}



}

