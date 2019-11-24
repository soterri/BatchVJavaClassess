package com.repltasks;

public class ClassAndObject106 {


		String carColor, carName;
		int ModelYear;

		public static void main(String[] args) {
			
		ClassAndObject106 main1 = new ClassAndObject106();
		main1.carColor="Black";
		main1.ModelYear=2019;
		main1.carName="BMW";
		
		ClassAndObject106 main2 = new ClassAndObject106();
		main2.carColor="White";
		main2.ModelYear=2018;
		main2.carName="Toyota";
		
		System.out.println("Car color is " +main1.carColor+  " and car model is " +main1.ModelYear+ " and car name is "
		+main1.carName);

		System.out.println("Car color is " +main2.carColor+  " and car model is " +main2.ModelYear+ " and car name is "
		+main2.carName);
		}
		

}
