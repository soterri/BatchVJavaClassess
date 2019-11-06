package com.class5;

import java.util.Scanner;

public class MoreLogicalExamples {

	public static void main(String[] args) {
		//to import short cut is ctr+shift+0
		/* ask user to enter daily sales
		 * based on the sales range we wants to give commission to the person
		 * if sales <100 --> commission is 10%
		 * if sales is b/w 100 -200 - > comm of 20%
		 * etc..
		 */

		Scanner scan;
		double salesAmount;
		double commission;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales");
		salesAmount=scan.nextDouble();
		
		if(salesAmount<100) {
			//if sales amt is less than 100, give user 10% comm of a sale
			commission=salesAmount*0.1;
			}else if (salesAmount>100 && salesAmount <200) {
				//lets give user 10% comm of a sale
			commission=salesAmount*0.2;
			}else if (salesAmount>200 && salesAmount<500) {
			commission=salesAmount*0.3;
			}else if(salesAmount>=500) {
				commission=salesAmount*0.5;
			}else {
				commission=0;
				
			}
		System.out.println("Based on the sales your commission is " +commission);
		
		
	}

}

