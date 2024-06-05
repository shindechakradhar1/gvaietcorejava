package com.gvacharya.oops.objectcasting.main;

import com.gvacharya.oops.objectcasting.Bank;
import com.gvacharya.oops.objectcasting.RBI;
import com.gvacharya.oops.objectcasting.SBI;

public class MainRBIBank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setAccNo(12098310);
		bank.setAccType("Saving");
		
		
		
		RBI rBI =new RBI();
		rBI.setAccNo(98120938);
		rBI.setAccType("Current");
		rBI.setPrintEquipment("500");
		
//		bank.printAccountDetails();
//		rBI.printAccountDetails();
		
		// DownCast 
		RBI rBI1 = new RBI();
		rBI1.setAccNo(123123);
		rBI1.setAccType("123123");
		rBI1.setPrintEquipment("100");
		
		SBI sBI = new SBI();
		sBI.setAccNo(321312);
		sBI.setAccType("321321");
		
		//Up casting
		Bank bank1 = rBI1;
		bank1.printAccountDetails();
		
		bank1=sBI;
		bank1.printAccountDetails();
		
	}
}
