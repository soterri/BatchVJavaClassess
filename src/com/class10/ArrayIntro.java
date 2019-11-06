package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int a; 
		a=10; //assigning value
		
		int a1=10; //declaration and initialization at same time
		
		int[] b; //declaring an array --> but preferred way -- holding multiple values
		// in c[]; <-- can also use this
		
		b=new int[4]; //creating the array of integers using 4 because we are using 4 elements; 
		//initializing array
		
		int[] array=new int[4]; //2 way to do it all in one line
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//access value from array
		System.out.println(array[2]);
		
		//lets create an array that will store classes
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		//now lets see to print it.. such as today we have java class
		System.out.println("Today to we have " +classes[0]+ " class"); //content string to variable
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		// how can we change 1 to 100? how are we going to reassign it?
		nums[0]=100; //just changing the value 
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]); //100+3
		
		String[] names=new String[3]; //creating an array of strings storing 3 elements
		names[0]="John";
		names[1]="Terri";
		names[2]="Ange";
		// what will happen if you try to store a 4th element w/o changing the string element?
		//names[3]="Max"; during run time will get --> an exception -> ArrayIndexOutOfBoundsException
		// will not run bc the [3] is a fixed size! the size of an array is fixed
		System.out.println(names[2]);
		
		//trying to store the 4 elements but only putting two elements 
		int[] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]);
		// it outputs 0 bc the compiler will give you default integers which is 0
		
		//trying double// we are putting less elements inside compiler will also give default values
		double[] numberss=new double[4];
		numberss[1]=100;
		numberss[3]=200;
		System.out.println(numbers[2]);
		
		
	}

}
