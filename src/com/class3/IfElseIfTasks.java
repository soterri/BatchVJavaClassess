package com.class3;

public class IfElseIfTasks {

	public static void main(String[] args) {
		
		
		
	
			
		int month=4;
		if(month==1) {
			System.out.println("January is Ange's birth month");
		}else if (month==2) {
			System.out.println("February is Valentine's month");
		}else if (month==3) {
			System.out.println("March is a greem month");
		}else if (month==4) {
			System.out.println("April is my birthday month");
		}else if (month==5) {
			System.out.println("May is Max's birthday month");
		}else if (month==6) {
			System.out.println("June is when kids school is over");
		}else if (month==7) {
			System.out.println("July is Sophy's birthday month");
		}else if (month==8) {
			System.out.println("August is David's birthday month");
		}else if(month==9) {
			System.out.println("September is when school starts");
		}else if(month==10) {
			System.out.println("Halloween is in the month of October");
		}else if(month==11) {
			System.out.println("John's birthday is in November");
		}else if(month==12) {
			System.out.println("December is Christmas month");
		}
		

		
		//write a program to check whether number is + or -
		int b=7; 
		if (b>0) {
			System.out.println("The number " +b+ " is positive");
		}else {
			System.out.println("The number is negative");
			
		}
		
		int t=10;
		if(t%5==0) {
		System.out.println("The number " +t+ " is even");
		}else {
			System.out.println("The number is " +t+ " is odd" );
		}
		
		int tempCheck=32;
		int storeTemp=-10;
		if(tempCheck<=storeTemp) {
		System.out.println("Water will freeze with temperature " +storeTemp);
	}else {
		System.out.println("Water will NOT freeze with temperature " +tempCheck);

		}
		double max=0516.12;
		double sophy=0712.13;
		if (sophy>max) {
			System.out.println("Double value " +sophy+ " is larger than " +max);
		}
		
	}
}

