package com.gvacharya.oops.abstraction1.main;

import com.gvacharya.oops.abstraction1.BankAccount;
import com.gvacharya.oops.abstraction1.CurrentAccount;
import com.gvacharya.oops.abstraction1.SavingAccountChild;

public class MainBankAccount {

	public static void main(String[] args) {
		BankAccount bankAccount = new SavingAccountChild();
		
		bankAccount.print();
		
		bankAccount = new CurrentAccount();
		bankAccount.print();
	}
}
