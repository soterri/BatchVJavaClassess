package com.class12;

public class ForEachLoop {

	public static void main(String[] args) {
		
		
		
		int[] array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=14;
		
		int[] arary2= {2,5,4,7};
		
		System.out.println(array1[1]);
		
		for(int s=0; s<array1.length; s++) {
		System.out.println(array1[s]);
	}
		System.out.println("*********");
		for (int i:array1) {
			System.out.println(i);
		}
}
}
