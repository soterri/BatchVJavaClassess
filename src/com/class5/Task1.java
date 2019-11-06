package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*ask user to enter boolean value
		 * if no sale --> no shopping
		 * if sale --> check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price will be less than $20 than apply 10% d/c 
		 * if price b/w 20 -100 will give 20% d/c 
		 * if b/w 100-500 will give 30% d/c
		 * anything else 50% d/c
		 * at the end of program... after d/c the price of the item reduced from x to x 
		 */

		
		Scanner inp = new Scanner(System.in);
		System.out.println("Is there a sale going on? True or False");
		boolean sale = inp.nextBoolean();

		double price;
		double discount;
		double finalPrice;

		if (!sale) {
			System.out.println("I am not shopping");
		} else {

			System.out.println("What is the actual price?");
			price = inp.nextDouble();

				if (price < 20) {
					discount = price * 0.10;
					// finalPrice = price - discount;
				} else if (price >= 20 && price < 100) {
					discount = price * 0.20;
					// finalPrice = price - discount;
				} else if (price >= 100 && price < 500) {
					discount = price * 0.30;
					// finalPrice = price - discount;
				} else {
					discount = price * 0.50;
				}
			finalPrice = price - discount;
			System.out.println(
					"After discount " + discount + 
					" the price of the item reduce from " + 
							price + " to " + finalPrice);
		}
	}
}