package com.class26;

public class Bank {
	
	double money;
	
	public double chargeFee() {
		double fee=0;
		if (money<1000) {
			fee=money*0.1;
			
		}else {
			fee=0;
		}
		return fee;
	}

}

class PNC extends Bank{
	@Override //optional to verify that you are actually over riding 
	//when youre trying to override must make sure return type and method signature(method+parameters) is same
	//method name and parameter 
	
	public double chargeFee() {
		double fee;
		if (money<1000) {
			fee=money*0.05;
			
		}else {
			fee=0;
		}
		return fee;
	}
	
}