package com.gvacharya.oops.overriding.main;

import com.gvacharya.oops.overriding.Child;
import com.gvacharya.oops.overriding.Parent;

public class MainChildParent {

	public static void main(String[] args) {
		Parent gundappa = new Parent();
		gundappa.setProfession("Clerk");
		
		
		Child raju = new Child();
		raju.setProfession("wasuli");
		
		
		gundappa.printProfession();
		raju.printProfession();
		
	}
}
