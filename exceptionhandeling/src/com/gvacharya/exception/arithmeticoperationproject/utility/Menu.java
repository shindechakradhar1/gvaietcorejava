package com.gvacharya.exception.arithmeticoperationproject.utility;

public enum Menu {
	ADD(1, "Add Two Numbers"),
	SUBSTRACTION(2, "Substract Two Numbers"),
	MULTIPLY(3, "Multiply Two Numbers"),
	DIVIDE(4, "Divide Two Numbers");
	
	private String info;
	private int srNo;
	
	private Menu(int srNo, String info) {
		this.srNo=srNo;
		this.info=info;
	}
	public String getInfo() {
		return info;
	}
	public int getSrNo() {
		return srNo;
	}
	
}
