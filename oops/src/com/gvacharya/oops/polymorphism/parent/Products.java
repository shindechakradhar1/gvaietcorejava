package com.gvacharya.oops.polymorphism.parent;

public class Products {

	private float price;
	private String brand;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(float price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProduct() {
		return "price: " + price + " brand:" + brand;
	}
	
	@Override
	public String toString() {
		return "Products [price=" + price + ", brand=" + brand + "]";
	}
}
