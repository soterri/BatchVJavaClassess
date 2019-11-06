package com.class5;

public class logicalOperators {

	public static void main(String[] args) {
		
		
		
		
		//logical operators -> and, or, not
		
		/*if number is b/w 1-10 -> this num is small
		 * if number is b/w 10-100 -> num is medium
		 * if number is b/w 100-1000 -> num is large
		 * any other number -> is out of range
		 */
		int num=200;
		//true AND false --> false
		//condition
		if (num>1 && num<10) {
			System.out.println("This number is small");
			//true AND false -> false
		}else if(num>=10 && num<100) {
			System.out.println("This number is medium");
			//true and true -> true
		}else if(num>=100 && num<1000) {
			System.out.println("This number is large");
		}else {
			System.out.println("This number is out of range");
			
			
			
			
			
		}
		
		
	}

}
