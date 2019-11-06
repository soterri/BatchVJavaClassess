package com.class11;

public class TwoDArrays {

	public static void main(String[] args) {
		
		
		
		//want to create an array of strings
		
		String[][] names= {
				{"John","Terri","Ange","Max"},
				{"Chanthavong", "Sophy", "Vanna","Atiana"},
				{"Sotheary", "Johnny", "Angelina","Cameron"},
				
		};
		
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfColumns=names[1].length; //first row of arrays
		System.out.println(lengthOfColumns);
		
		for(String getArrays[]: names) {
		for(String getNames: getArrays) {

				System.out.print(getNames+" ");
		}
		System.out.println();
	}

}
}
