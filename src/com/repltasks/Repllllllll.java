package com.repltasks;

import java.util.Scanner;

public class Repllllllll {
	
	 public static void main(String[] args){
		    
		 	String act, age;
		 	
		    Scanner scan=new Scanner(System.in);
		    System.out.println("enter the age of the Child");
		    age=scan.nextLine();
		    
		    switch(age){
		      
		      case  "1":
		        act="You can Crawl";
		        
		      case  "2":
		        act="You can Talk";
		        
		      case  "3":
		        act="You can Dance";
		        
		      case  "4":
		        act="You can get Trouble";
		        
		      default: 
		        act="I don't know how old you are";
		        }
		        System.out.println(act);
		  }
		}


