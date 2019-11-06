package com.class10;

public class ArrayTasks {

	public static void main(String[] args) {
		
		
		//1 way
		char[] array=new char[6];
		array[0]='A';
		array[1]='B';
		array[2]='C';
		array[3]='D';
		array[4]='E';
		array[5]='F';
		System.out.println(array[1]);
		
		//shorter way
		//char[] grades=new char[6];
		char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grades[1]); //getting the element from the index of grades
		//int a=2 -> access the element 2 which is C 
		
		String[] names=new String[5];
		names[0]="John";
		names[1]="Terri";
		names[2]="Ange";
		names[3]="Max";
		names[4]="Sophy";
		System.out.println(names[1]);
		
		//shorter way
		String[] names1= {"John", "Terri", "Ange", "Max", "Sophy"};
		System.out.println(names1[1]);
		
		String[] words=new String[5];
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
		
		
		
		
		
		
		
		
	}

}
