package com.class5;

import java.util.Scanner;

public class LogicalHomework {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("What was your quiz score?");
		int average=scan.nextInt();
		
		System.out.println("What was your mid term score?");
		int score=scan.nextInt();
		
		System.out.println("What was your final score?");
		int finalscore=scan.nextInt();
		
		int averageScore=((average + score + finalscore)/3);
		
		if(averageScore>=90) {
			System.out.println("You got an A");
		}else if(averageScore>=70 && averageScore<90) {
			System.out.println("You got a B");
		}else if(averageScore>=50 && averageScore<70 ) {
			System.out.println("You got a C");
		}else if (averageScore<=50) {
			System.out.println("You got an F");
		}else {
			System.out.println("You don't have a score");
			
}
	}

}
