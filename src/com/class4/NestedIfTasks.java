package com.class4;

public class NestedIfTasks {

	public static void main(String[] args) {
		
		boolean diploma=true;
		double gpa=3.5;
		
		if(diploma) {
			System.out.println("Congrats!");
			if(gpa>=3.5) {
			System.out.println("you are eligible for a scholarship");
			}else if(gpa>=3.5) {
			System.out.println("You should have studied harder");
			}else {
				System.out.println("You should get a degree");
			}
	
			}
		
		double mortgageRate=4.5;
		int mortgagePrice=200000;
		
			if(mortgageRate>=4.5) {
				
			System.out.println("I will not buy a house");
			}else {
			System.out.println("I will consider buying the house");	
			
			if (mortgagePrice>200000) {
				
			System.out.println("I will need a loan to buy the house");
			
			}else {
				
			System.out.println("I will buy the house with cash");
			
			 
			}
			}
			}
	}

		
		
	
	
		

	


