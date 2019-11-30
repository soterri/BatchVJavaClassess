package com.class25;

public class WaterFallTeam extends Employee {

	public static void main(String[] args) {
		
		
	WaterFallTeam team=new WaterFallTeam();
	team.companyName="Syntax";
	//team.salary=DEFAULT not accessible in diff. pkg
	team.employeeId=102; //protected variables
	//will be accessible thru diff. pkgs bc of inheritance 
	
	
	
	

	}

}
