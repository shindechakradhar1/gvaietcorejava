package com.gvacharya.oops.polymorphism.child;

import com.gvacharya.oops.polymorphism.parent.Products;

public class Foods extends Products {

	private String expiryDate;
	private boolean veg;

	public Foods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Foods(String expiryDate, boolean veg) {
		super();
		this.expiryDate = expiryDate;
		this.veg = veg;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	@Override
	public String getProduct() {
		return "Brand:" + getBrand() + " price:" + getPrice() + " ExpiryDate:" + expiryDate + " veg:" + veg;
	}
	
	@Override
	public String toString() {
		return "Food [expiryDate=" + expiryDate + ", veg=" + veg + "]";
	}

}
