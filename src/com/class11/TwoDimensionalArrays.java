package com.class11;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
	
		
		
		//to declare a 2D array.. the syntax of of a 2D array int [] [] array;
		
		int [] [] array=new int[3][4];
		
		//creating 1st row
		array [0][0]=44;
		array [0][1]=80;
		array [0][2]=33;
		array [0][3]=20;
		
		//2nd row // why 0? starts from 0 thats why // 1st row but 0 columns 
		array [1][0]=10;
		array [1][1]=5;
		array [1][2]=7;
		array [1][3]=8;
		
		//3rd row
		array [2][0]=10;
		array [2][1]=9;
		array [2][2]=70;
		array [2][3]=6;
		System.out.println(array[1][3]);
		
		//tasks: create a 2D array of String with 2 rows and 3 columns
		
		String [] [] names=new String[2][3];
		names [0][0]="John";
		names [0][1]="Terri";
		names [0][2]="Ange";
		
		names [1][0]="Max";
		names [1][1]="Sophy";
		names [1][2]="Cameron";
		System.out.println(names[0][2]);
		
		
		
		int [][] numbers={
			{8,7,5,3,8},
			{1,5,6,4,9},
			{3,6,8,0,7}
			
		};
		System.out.println("The value in index 1 and 4 is= "+numbers[1][4]);
		
		//to identify the numbers of rows
		System.out.println("The numbers of Rows are:="+numbers.length);
		
		//to identify the numbers of columns
		System.out.println("The numbers of columns are: " +numbers[0].length);
		
		for (int i=0; i<numbers.length; i++ ) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
	}

}
