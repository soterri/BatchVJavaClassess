package com.class5;

import java.util.Scanner;

public class LogicalOpsTasks {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number day number");
		int day=scan.nextInt();
		
		if (day==1 && day==7) {
			System.out.println("It is a weekend");
		}else if(day==2 || day==3 || day==4 || day==5 || day==6) {
			System.out.println("It is a weekday");
		}else {
			System.out.println("Invalid day");
			
		}
	}

}
