package com.class4;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter temp");
		int temp=scan.nextInt();
		
		System.out.println("please enter your city");
		String cityName=scan.next();
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("The temp in city " +cityName+ " is " +convertedTemp);
		
		
		
	}

}
