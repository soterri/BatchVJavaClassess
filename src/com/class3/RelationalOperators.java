package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("***************");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b=d>d1;
		System.out.println(b);
		
		boolean b1=d<d1;
		boolean b2=d==d1;
		boolean b3=d!=d1;
		System.out.println(b1); //true
		System.out.println(b2); //false
		System.out.println(b3); //true
		// will be used in our "if" statements
		System.out.println("***************");
		
		
		int a=20;
		int c=30;
		//if num a is bigger than num b 
		//in the output, to print a is larger than b
		
		if (a>c) { 
			System.out.println("a is larger than c");
			//didnt get an output bc the condition is false
			
			int y=90;
			int x=30;
			if (y>x) {
				System.out.println("y is larger than x");
				// else is otherwise
				}else {
					System.out.println("a is smaller than b");
					
				}
		}
		
		
		
		
		
		
		
	}

}
