package com.class25;

public class Addition {
	//method overloading is having the same method name within the same class
	//two ways to acheive it 
	//1. PASSING DIFFERENT  -AMOUNT- OF PARAMETERS 
	
	//entire method header, access modifer, access type, name 
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
		}
	//protected int add(int num1, int num2) { //method signature must be different bc its a duplicate 
		//return num1+num2; this won't be considered method overloading
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	//2. BY HAVING DIFFERENT -TYPES- OF PARAMETERS
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public double add(int num1, double num2) {
		//System.out.println(num1+num2);
		double sum=num1+num2;
		return sum;
	}
	public static void main(String[] args) {
		
		Addition obj=new Addition();
		obj.add(12, 13);
		obj.add(12, 13, 14);
		obj.add(12.09,  12.10);
		
		
		String str="Hello";
		System.out.println(str.substring(3));
		str.subSequence(1, 3);
		
		
	}
}
