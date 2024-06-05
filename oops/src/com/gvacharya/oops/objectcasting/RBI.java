package com.gvacharya.oops.objectcasting;

public class RBI extends Bank{

	private String printEquipment;

	public RBI() {}

	public RBI(String printEquipment) {
		this.printEquipment = printEquipment;
	}

	public String getPrintEquipment() {
		return printEquipment;
	}

	public void setPrintEquipment(String printEquipment) {
		this.printEquipment = printEquipment;
	}
	
	@Override
	public void printAccountDetails() {
		System.out.println("RBI" +"Acc No:" + getAccNo() + " Acc type:" + getAccType() + "Printing Equipment:" + printEquipment);
	}

	@Override
	public String toString() {
		return "RBI [printEquipment=" + printEquipment + "]";
	}
}
