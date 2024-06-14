package com.gvacharya.oops.overriding.main;

import com.gvacharya.oops.overriding.parent.Bank;
import com.gvacharya.oops.overriding.parent.SBI;

public class MainBankSbi {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setAccountNumber(123);
		bank.setAccountHolderName("ABC");
		bank.printDetails();
		
		
		SBI sbi = new SBI();
		sbi.setAccountHolderName("XYZ");
		sbi.setAccountNumber(321);
		sbi.setKyc(true);
		sbi.printDetails();
	}
}
