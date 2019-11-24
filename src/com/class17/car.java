package com.class17;

public class car {
	/*STEP 1: BUILDING THE FEATS/ATTRIBUTES OF THE TEMPLATE: WE WILL DEFINE BY VARIABLES
		 * STEP 2: BUILD TEMPLATE! BUILT FEATS OF CLASS.
		 * 
		 */
		String make, model, color;
		int year, wheels, windows, speed; 
		
		//adding BEHAVIOR/ACTION --> will be using methods();
		void drive() { // defining the method header and method body
			System.out.println("Car " +make+ " can drive");
		}
		void start() {
			System.out.println("Car " +make+ " can start");
			
		}
		void accelerate() {
			System.out.println("Car " +make+ " can accelerate");
		}
	 
	}


