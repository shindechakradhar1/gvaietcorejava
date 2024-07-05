package com.gvacharya.generic.mobilebill;

import com.gvacharya.generic.mobilebill.framework.MobileBill;
import com.gvacharya.generic.mobilebill.framework.PostPaid;
import com.gvacharya.generic.mobilebill.framework.PrePaid;

public class App {

	public static void main(String[] args) {
		PrePaid airtel = new PrePaid();
		airtel.setNoOfDays(30);
//		float bill=airtel.generateBill(airtel);
//		System.out.println(bill);
		
		PostPaid airtel1 = new PostPaid();
		airtel1.setNoOfDays(30);
//		float postPaidBill = airtel1.generateBill(airtel1);
//		System.out.println(postPaidBill);

		MobileBill<PrePaid> obj = 
				(airtel11->10.10f*airtel11.getNoOfDays());
		
		MobileBill<PostPaid> obj1 = 
				(airtel11->20.10f*airtel11.getNoOfDays());
		
		Float billPrePaid=obj.generateBill(airtel);
		System.out.println(billPrePaid);
		
		Float billPostPaid = obj1.generateBill(airtel1);
		System.out.println(billPostPaid);
	}
}
