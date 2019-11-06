package com.class10;

public class LoopsInArrays {

	public static void main(String[] args) {
		
		
		
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		//to not print lines multiples times use for loop
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		String[] animals= {"Cat", "Dog", "Cow", "Snakes", "Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.println(animals[i]+ " ");
			
		}
		
		//create an array of 5 double values
		
		double[] values= {100.1, 102.3, 105.3, 107.8};
		double value=values.length;
		
		for(double i=0; i<value; i++);
		System.out.println(values[1]+ " ");
		
		
	}

}
