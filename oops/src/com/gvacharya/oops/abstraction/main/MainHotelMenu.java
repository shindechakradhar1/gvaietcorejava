package com.gvacharya.oops.abstraction.main;

import com.gvacharya.oops.abstraction.HotelMenu;
import com.gvacharya.oops.abstraction.NonVegMenu;
import com.gvacharya.oops.abstraction.VegMenu;

public class MainHotelMenu {

	public static void main(String[] args) {
		
		String name;
		
		HotelMenu menu = new VegMenu();
		// Accessing super class method
		menu.setSrNo(1);
		// accessing sub class method which is overriden
		menu.displayMenu();
		
		
		HotelMenu nonvegMenu = new NonVegMenu();
		// Accessing super class method
		nonvegMenu.setSrNo(10);
		// accessing sub class method which is overriden
		nonvegMenu.displayMenu();
		
	}
}
