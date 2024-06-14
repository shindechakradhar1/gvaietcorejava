package com.gvacharya.oops.inheritance.main;

import com.gvacharya.oops.inheritance.child.Child;
import com.gvacharya.oops.inheritance.parent.Parent;

public class MainParentChild {

	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child();
		
		parent.printMessageParent();
		child.printMessageParent();
		child.printMessageChild();
	}
}
