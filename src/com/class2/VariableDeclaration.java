package com.class2;

public class VariableDeclaration {
	
	public static void main(String[] args) {
		
		//1. declaring a variable num1 that will hold value of int1 
		
		
		//2. declare variable first and then assign value
		 int n1;
		 int n2;
		 int n3;
		 n1=5;
		 n2=7676;
		 n3=767;
		 
		 //3. declare all variable together and then assign value
		 int number1, number2, number3;
		 number1=12;
		 number2=15;
		 number3=676;
		 System.out.println(n1);
		 
		 number3=1000;
		 System.out.println(number3);
		 
		 boolean var=true;
		 System.out.println(var);
		 
		 //if you run this it wont run bc theres no declaration
		 //System.out.println(myVariable);
		 
		 char myVariable='^';
		 System.out.println(myVariable);
		 
		 number2=number1;// it is 12 bc the variable was changed
		 System.out.println(number2);
		 
		 //number2=false <- error this wont bc trying to store integers instead of boolean
		 //compile error asking to change error type of variable number 2 to boolean
		 
		 boolean isRain=false;
		 boolean isSnow;
		 isSnow=isRain; //isSnow=false
		 isSnow=true;
		 System.out.println(isSnow);
		 
		 isSnow=true;
		 System.out.println(isSnow);
		 
		 
		 
		 
	
	
	
	}

}
