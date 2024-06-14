package com.gvacharya.oops.abstraction1.main;

import com.gvacharya.oops.abstraction1.Child;
import com.gvacharya.oops.abstraction1.Parent;

public class MainParent {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		int result=parent.getHeight();
		
		System.out.println(result);
	}
}
