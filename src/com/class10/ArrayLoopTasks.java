package com.class10;

public class ArrayLoopTasks {

	
public static void main(String[] args) {
	
//	//Create an array of countries. 
//	//While retrieving all values from an array print capital for each country. 

	
	String[] countries= {"USA", "Cambodia","Laos", "Vietnam"};
	
	for (int i=0; i<countries.length; i++) {
		
		if(countries[i].equals("USA")) {
			System.out.println("DC");
			
		}else if(countries[i].equals("Cambodia")) {
			System.out.println("Phnom Penh");
		}else if(countries[i].equals("Laos")) {
			System.out.println("Vientiane");
		}else if(countries[i].equals("Vietnam")) {
			System.out.println("Saigon City");
			
		}
	
}

}
}
