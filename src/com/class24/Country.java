package com.class24;

public class Country {
	
	public String capital, name;
	public int population;
	
	
	// non-argumentive constructor, specifying constructor
	Country(){
		System.out.println("I am a non argument constructor");
	}
	
	Country(String countryName, String countryCapital, int population) {
		this.name=countryName;
		this.capital=countryCapital;
		this.population=population;
	}
	//specifying method
	public void displayInfo() {
		System.out.println(name+" " +capital);
	}

	public static void main(String[] args) {
//		Country country1=new Country(); // new creates a object -> constructor code 
//		country1.name="USA";
//		country1.capital="Washington DC";
//		
//		Country country2=new Country();
//		country2.name="Cambodia";
//		country2.capital="Phnom Penh";
		//calling constructor
		Country country1=new Country("USA", "Washington DC", 350);
		Country country2=new Country("Cambodia", "Phnom Penh", 100);
		Country country3=new Country();
		
		//calling method
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
//		System.out.println(country1.name);
		
		
		
		

		
	}
}
