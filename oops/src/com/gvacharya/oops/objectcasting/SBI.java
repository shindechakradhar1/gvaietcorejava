package com.gvacharya.oops.objectcasting;

public class SBI extends Bank{

	@Override
	public void printAccountDetails() {
		System.out.println("SBI" + "Acc No:" + getAccNo() + " Acc type:" + getAccType());
	}
	
	public void printSBIDetails() {
		System.out.println("hi");
	}
}
