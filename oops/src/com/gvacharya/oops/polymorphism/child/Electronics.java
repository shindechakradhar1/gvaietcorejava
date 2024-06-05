package com.gvacharya.oops.polymorphism.child;

import com.gvacharya.oops.polymorphism.parent.Products;

public class Electronics extends Products {

	private boolean battery;
	private boolean wireless;

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(float price, String brand) {
		super(price, brand);
		// TODO Auto-generated constructor stub
	}

	public Electronics(boolean battery, boolean wireless) {
		super();
		this.battery = battery;
		this.wireless = wireless;
	}

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String getProduct() {
		return "Brand:" + getBrand() + " price:" + getPrice() + " Battery:" + battery + " Wireless:" + wireless; 
	}

	public String getProduct1() {
		return "Brand:" + getBrand() + " price:" + getPrice() + " Battery:" + battery + " Wireless:" + wireless; 
	}
	
	@Override
	public String toString() {
		return "Electronics [battery=" + battery + ", wireless=" + wireless + "]";
	}

}
