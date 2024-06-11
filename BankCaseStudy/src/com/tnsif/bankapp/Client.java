package com.tnsif.bankapp;

import com.tnsif.bankapp.Framework.BankFactory;
import com.tnsif.bankapp.Framework.CurrentAccount;
import com.tnsif.bankapp.Framework.SavingAccount;
import com.tnsif.bankapp.application.MMBankFactory;

public class Client {

	public static void main(String[] args) {
		BankFactory bankFactory = new MMBankFactory();
		SavingAccount savingAccount1 = bankFactory.getSavingAccount(10001, "Employee1", 2000, true); 
		savingAccount1.withdraw(19500);
		savingAccount1.withdraw(100);
		
		
		CurrentAccount currentAccount = bankFactory.getCurrentAccount(90002, "Business1", 10000, 10000);
		currentAccount.withdraw(19000);
		currentAccount.withdraw(19000);
	}
}
