package com.class3;

public class Homework {

	public static void main(String[] args) {
	
	//recap	using "if else" is listing all possible options 
	int num=23;
	num=90;
	num-=200; //-110-90-200
	num-=110;
	num+=220;
	
	if(num>0) {
		System.out.println(num + "is a positive number");
	}else if  (num==0) {
		System.out.println("Value of num is " + num);
		}else { 
		System.out.println(num + "is a negative number");
		}
	//even or odd (7,8)

	int i=137;
	if (i%2==0) {
	System.out.println(i+ " is an even number");
	}else {
	System.out.println(i+ " is an odd number");
} 
//2
	if(i%2!=0) {
		System.out.println(i+ " is a even number");
	}else {
		System.out.println(i+ " is a odd number");
	}
}
}