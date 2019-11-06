package com.repltasks;

import java.util.Scanner;

public class MagicMoney {

	public static void main(String[] args) {
//		for (int i=1; i<=4; i++){
//		      
//		      for(int j=1;j<=4; j++){
//		        if(i==1||j==1||i==4||j==4){
//		      System.out.print("$");
//		        }else{
//		          System.out.print(" ");
//		        }
//		      }
//		      System.out.println();
//		      }
//		}
//
//	
//		    Scanner inp = new Scanner(System.in);
//		    System.out.print("Int:");
//		    int end = inp.nextInt();
//		    //write your code below
//		    
//		    for(int i=0; i<(2*end); i++){
//		      System.out.print
//		      (" "+i);
//		    }
//		    
//		    
//		  }
//		}
		

		 Scanner scan=new Scanner(System.in);
		  
		  String[] daysOfWeek=new String[7];
		  for(int i=0; i<daysOfWeek.length; i++){
		    System.out.println("Please enter day "+(i+1)+" day of the week");
		    daysOfWeek[i]=scan.nextLine();	
		    }
		  for(int j=0; j<daysOfWeek.length; j++) {
			  System.out.println(daysOfWeek[j]);
		  }
}
}