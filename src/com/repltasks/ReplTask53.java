package com.repltasks;

public class ReplTask53 {

	public static void main(String[] args) {
		/*Print 1 to 10 Numbers except 7, 8, 9, 5  using the While loop

		Step 1: Initialize the i value as int i=1

		Step 2: Create the while loop to check the condition 

		Step 3: Write the if condition for validation part

		Step 4 : It should print
		1
		2
		3
		4
		6
		10*/
		
		
		int i=1;
		while (i<=10) {
			if (i>=1 && i<=4 || i==6 || i==10) {
				System.out.println(i);
			}
			i++;
		}

	}

}
