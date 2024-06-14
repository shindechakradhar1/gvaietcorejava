package com.gvacharya.oops.abstraction;

public class NonVegMenu extends HotelMenu {

	@Override
	public void displayMenu() {
		System.out.println("Non-Veg Menu");
		System.out.println("1. Chikka Tikka");
		System.out.println("2. Chicken Sukka");
		System.out.println("3. Paplet Fry");
		System.out.println("4. Chicken Tandoori");
	}
}
