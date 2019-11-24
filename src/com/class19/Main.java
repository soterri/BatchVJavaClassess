package com.class19;

public class Main {
	
		  
		  int mult(int a,int b){
		    int equal=a*b;
		    return equal;
		  }
		  int add(int c,int d) {
		    int equal=c+d;
		    return equal;
		  }
		  int sub(int e,int f) {
		    int equal=e-f;
		    return equal;
		  }
		public static void main(String[] args){
		  Main equals=new Main();
		  
		  
		System.out.println("Addition " +equals.add(20, 10));
		  System.out.println("Multiplication " +equals.mult(10, 3));
		  System.out.println("Subtraction " +equals.sub(30,10));
		  
		}
		}

