package com.repltasks;

public class SwitchRepl {

	public static void main(String[] args) {
		
	//Step 1: You have variable iSwitch=6;

	//Step 2:  Do the switch for the other cases but for your value it should print 
	//out "Not in the list"

	//Output:
	//"Not in the list"
		
		int iSwitch=6;
		   switch(iSwitch){
		     case 0:
		     System.out.println("ZERO");
		     break;
		     
		     case 1:
		     System.out.println("ONE");
		     break;
		     
		     case 2: 
		     System.out.println("TWO");
		     break;
		     
		     case 3:
		     System.out.println("THREE");
		     break;
		     
		     case 4:
		    	 System.out.println("FOUR");
		    	 
		     case 5:
		    	 System.out.println("FIVE");	
		    	 break;
		    	 
		    	 default:
		    		 System.out.println("not in the list");
	}
		   
}
	
}
