package com.class10;

public class SwitchArray {

	public static void main(String[] args) {
		String[] countries= {"USA", "Cambodia","Laos", "Vietnam"};
		
		
		
		for (int i=0; i<countries.length; i++) {
		
			switch(countries[i]) {
				
			case "USA":
				System.out.println("DC");
				break;
				
			case "Cambodia":
				System.out.println("Phnom Penh");
				break;
				
			case "Laos":
				System.out.println("Vientiane");
				break;
			
			case "Vietnam":
				System.out.println("Saigon City");
				break;
				

			}
		}
		
		
	}
}
