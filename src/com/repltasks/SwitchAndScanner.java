package com.repltasks;

import java.util.Scanner;

public class SwitchAndScanner {

	public static void main(String[] args) {
	
		
		   String carModel, carOrigin;
		   
		   	Scanner scan=new Scanner(System.in);
		   	System.out.println("Please enter your favorite car make");
		    carModel=scan.nextLine();
		    
		    switch(carModel){
		      case "BMW":
		    	  carOrigin="german car";
		        break;
		        
		      case "Toyota":
		    	  carOrigin="japanese car";
		        break;
		        
		        case "Maserati":
		        	carOrigin="italian car";
		          break;
		          
		          default: 
		        	  carModel="unknown";
		        	  carOrigin="unknown";
		       
		    }
		    System.out.println("Your favorite car is " +carModel);
		  }

		}
		
		


