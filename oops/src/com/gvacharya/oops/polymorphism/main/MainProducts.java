package com.gvacharya.oops.polymorphism.main;

import com.gvacharya.oops.polymorphism.child.Electronics;
import com.gvacharya.oops.polymorphism.child.Foods;
import com.gvacharya.oops.polymorphism.parent.Products;

public class MainProducts {

	public static void main(String[] args) {
		Products product = new Products();
		Electronics charger = new Electronics();
		Foods milk = new Foods();
		
		charger.setBrand("1Plus");
		charger.setPrice(1000.40F);
		charger.setBattery(false);
		charger.setWireless(false);
		
		
		milk.setBrand("Gokul");
		milk.setPrice(30.15F);
		milk.setExpiryDate("07-06-2024");
		milk.setVeg(true);
		
		
		System.out.println(product.getProduct());
		
		
		// Polymorphism 
		//upcasting
		product=charger;
		System.out.println(product.getProduct());
		System.out.println(charger.getProduct1());
		
		//upcasting 
		product=milk;
		System.out.println(product.getProduct());
		
	}
}
