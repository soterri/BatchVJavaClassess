package com.class11;

public class forLoopsTasks {

	public static void main(String[] args) {
	
		
		//task 1
		String[] cars1= new String[6];
		cars1[0]="Acura";
		cars1[1]="Honda";
		cars1[2]="Audi";
		cars1[3]="BMW";
		cars1[4]="Mercedes";
		cars1[5]="Toyota";
		System.out.println(cars1[4]);
		
		String[] cars = {"Acura", "Honda", "Audi", "BMW", "Mercedes", "Toyota"};
			System.out.println(cars[0]);
			System.out.println(cars[1]);
			System.out.println(cars[2]);
			System.out.println(cars[3]);
			System.out.println(cars[4]);
			System.out.println(cars[5]);
			
			//task2
			int[] array=new int[4]; //2 way to do it all in one line
			array[0]=10;
			array[1]=20;
			array[2]=30;
			array[3]=40;
			System.out.println(array[0]+array[1]+array[2]+array[3]);
			
			//task3
			String[] countries= {"USA", "Cambodia","Laos", "Vietnam"};
			
			for(String getCountry:countries) {
				if(getCountry.contentEquals("Cambodia")) {
					System.out.println("The capital of Cambodia is Phnom Penh");
				}
			}
				for (int i=0; i<countries.length; i++) {
					if(countries[i].contentEquals("Cambodia")) {
						System.out.println("The capital of Cambodia is Phnom Penh");
						
//			for (int i=0; i<countries.length; i++) {
//			
//				switch(countries[i]) {
//					
//				case "USA":
//					System.out.println("DC");
//					break;
//					
//				case "Cambodia":
//					System.out.println("Phnom Penh");
//					break;
//					
//				case "Laos":
//					System.out.println("Vientiane");
//					break;
//				
//				case "Vietnam":
//					System.out.println("Saigon City");
//					break;
//					

				}
			}
			
			
		}
				
		
	}

