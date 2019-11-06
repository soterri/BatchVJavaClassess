package com.class11;

public class Tasks {
public static void main(String[] args) {
	
	
	int [][] numbers={
			{1,3,5,7,9},
			{2,4,6,8,10},
			{3,6,9,12,15}
			
			
		};
	
		for (int i=0; i<numbers.length; i++ ) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
}
		int sum=0;
		for (int i=0; i<numbers.length; i++) {
			for( int j=0; j<numbers[i].length; j++) { 
		
		sum+=sum+numbers[i][j];
		}
			System.out.println();
		} 
		System.out.println("The sum of all elements in array is= "+sum);
		
		int sum1=0;
		for(int nums[]:numbers) {
			for(int getNum:nums) {
				if(getNum%2==0) {
				sum1=sum1+getNum;
				System.out.println(getNum+" Is even number");
			}
		}
		System.out.println("The sum of all elements in array is= "+sum1);
		
}	

}
}
