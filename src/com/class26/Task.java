package com.class26;

public class Task {
	
	 public static void main(String[]args){
		 Postgradue ps=new Postgradue();
		 ps.getdegree();
		 Degree d=new Degree();
		 d.getdegree();
		 Undegraduate un=new Undegraduate ();
		 un.getdegree();
		}}
	class Degree{
		void getdegree() {
			System.out.println("I got a degree");
		}
	}
	class Undegraduate extends Degree{
		@Override
		void getdegree() {
	      System.out.println("I am an Undegraduate");
		}}
	class Postgradue extends Degree{
		@Override
		void getdegree() {
			System.out.println("I am a Postgradue");
		}

}

