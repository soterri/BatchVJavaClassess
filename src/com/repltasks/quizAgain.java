package com.repltasks;

public class quizAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = 0; i < 3; ++i) {

		   for (int j = 0; j < 3; ++j) {

		       sum = sum + array_variable[i][j];

		   }

		}

		System.out.print(sum / 5);
	}

}
