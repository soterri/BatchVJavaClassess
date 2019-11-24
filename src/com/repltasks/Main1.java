package com.repltasks;

public class Main1 {

	 String breed, name, color;
	  
	  void bark() {
	System.out.println(breed+ " can bark");
	  	}
	  void run() {
		  System.out.println(breed+ " can run");
	  }
	  void play() {
		  System.out.println(breed+ " can play");
	  }
	  public static void main(String[] args) {
		  Main1 dog =new Main1();
		  dog.breed="Husky";
		  dog.name="Hulk";
		  dog.color="white";
		  
		  dog.bark();
		  dog.run();
		  dog.play();
		  
		  Main1 dog1=new Main1();
		  dog1.breed="Bulldog";
		  dog1.name="Lisa";
		  dog1.color="Brown";
		  
		  dog1.bark();
		  dog1.run();
		  dog1.play();
		  
		  Main1 dog2=new Main1();
		  dog2.breed="Labrador";
		  dog2.name="Sally";
		  dog2.color="Gray";
		  
		  dog2.bark();
		  dog2.run();
		  dog2.play();
		  
	  }
}
