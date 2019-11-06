package com.class11;

public class LoopsDemo {

	public static void main(String[] args) {
		
		
	
		//   1 initial        2condition5    4 in/de 7
		for (int i=1; i<=5; i++) {
			//3, 6
			System.out.println("How are you?");
			
			//for each loop 
			
			int[] array= new int[6];
			array[0] =33;
			
			//int[] arr= {2,3,5,7};
			int[] numbersList={2,3,5,7};
			
//			for(int g=0; g<arr.length; g++) {
//				System.out.println(arr[g]);
			
//			for(ar:arr) {
//				System.out.println(ar);
				
				for(int elemen:numbersList){
				System.out.println(elemen); 
			}
	}

	}
}

