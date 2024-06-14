package com.gvacharya.oops.encapsulation.main;

import com.gvacharya.oops.encapsulation.Student;

public class MainStudent {

	public static void main(String[] args) {
		Student aniket = new Student();
		
//		aniket.fees=4000;
//		aniket.name="Aniket1";
//		aniket.standard="5th Sem";
		
		aniket.setStandard("10th sem");
		aniket.setFees(-50000.50F);
		aniket.setName("Aniket1");
	}
}
