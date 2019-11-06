package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		String[] animals= {"Cat", "Cow", "Snake", "Dog", "Elephant"};
		// i want to print all values from an array
		// when value is Dog --> I love dogs
		//will use IF condition to store i love dogs
		
		for (int i=0; i<animals.length; i++) {
			
			//how to compare one string to a value
			if(animals[i].equals("Dog")) {
			//if(i==1)
			System.out.println("I love dogs");
			
		}else {
			System.out.println(animals[i]);
			
	
	
		}

	}

}
}