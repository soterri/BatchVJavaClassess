package com.class11;

import java.util.Arrays;

public class ArrayManipulation {
	public static void main(String[] args) {
		
		// SORTING ARRAYS STRING AND INTEGER
		
		
		String[] actualNames= {"Chanthavong", "Terri", "Angelina", "Chanthavong Jr.", "Sophy Vanna"};
		
		String[] expectedNames= {"John", "Terri", "Ange", "Max", "Sophy"};
		//to sort the elements of an Array
		Arrays.sort(actualNames);
		
		System.out.println(Arrays.toString(actualNames));
		
		String actual=Arrays.toString(actualNames);
		Arrays.sort(expectedNames);
		
		String expected=Arrays.toString(expectedNames);
		
		
		String firstName="John";
		String firstName1="Terri";
		
		String firstName3="Ange";
		String firstName4="Max";
		
		String act1=firstName+firstName1;
		String expt=firstName3+firstName4;
		System.out.println(act1);
		System.out.println(expt);
		
		//when you have an array of an integer
		int[] numbers= {123,34,15,66,99};
		        
		        for(int i:numbers) {
		            System.out.print(i+" ");
		        }
		        
		        System.out.println();
		        System.out.println("*******");
		        
		        
		        Arrays.sort(numbers);
		        for(int i:numbers) {
		            System.out.print(i+" ");
		        }
	}

}
