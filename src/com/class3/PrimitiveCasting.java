package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//last class
		double d=12;
		System.out.println(d);
		
		//int i=12.0; <- will get an error bc the datatype is wrong. needs to be double bc of the (.)
		
		//what is Casting? trying to change a type to another type 
		
		byte b=127;
		int i=b;
		
		//trying to put num into dbl
		int num=123;
		double d1=num;
		//called widening 
		System.out.println(d1);
		
		
		//narrowing/explicit/manual casting is going the opp. way dbl-float-long-int-short-byte
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		// a problem bc potential loss of info
		//now will add (int) before the d2 which is manually doing itself it is the syntax of casting
		//taking the variable and casting it
		
		//trying to take an int into byte
		int num3=1000;
		byte b1=(byte)num3;
		//now will do explicit casting by adding (byte) before num3 bc you want to get the int into byte
		System.out.println(b1);
		
		int num4=789;
		byte b2=(byte)num4;
		System.out.println(b2);
		
		

	}

}
