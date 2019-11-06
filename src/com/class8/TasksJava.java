package com.class8;

public class TasksJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//what is the out put
		int sum = 0;;
		for (int i=1; i<=5; i++) {
			sum = sum + i;
			System.out.println(sum+ "+");
		}
		System.out.println();
		System.out.println(sum); //
		
		System.out.println("***********");
		//what is the output
		int sumAll=0;
		
		for (int i=0; i<=20; i+=5) { //0,5,15,20
			sumAll=sumAll+i;
		}
		System.out.print(sumAll);
		
		
		int total=2;
		
		for (int y=1; y<=3; y++) {
			total=total*y; // 2=2*1; 4=2*2; 12=4*3
	}
		System.out.println(total);
}
}