package com.gvacharya.oops.abstraction.main;

import com.gvacharya.oops.abstraction.GrandChild;
import com.gvacharya.oops.abstraction.Parent;

public class MainParent {

	public static void main(String[] args) {
		Parent parent = new GrandChild();
		
		parent.method1();
		parent.method2();
		parent.method3();
		parent.method4();
		parent.method5();
		parent.method6();
		parent.method7();
		parent.method8();
		parent.method9();
		parent.method10();
		
		System.out.println(Parent.getNo(10));
	}
}
