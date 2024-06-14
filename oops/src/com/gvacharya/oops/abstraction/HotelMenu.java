package com.gvacharya.oops.abstraction;

public abstract class HotelMenu {

	private int srNo;

	public HotelMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelMenu(int srNo) {
		super();
		this.srNo = srNo;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	
	//abstract
	public abstract void displayMenu();

	@Override
	public String toString() {
		return "HotelMenu [srNo=" + srNo + "]";
	}

}
