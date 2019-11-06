package com.repltasks;

import java.util.Scanner;

public class Repl80Array {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);

		int[] values = new int[5];

		for(int i=0; i<5; i++){
		  values[i]=scan.nextInt();
		}
		System.out.println();
		
		for(int j=0; j<5; j++) {
			System.out.println(values[j]*10);
		}
	}
}
