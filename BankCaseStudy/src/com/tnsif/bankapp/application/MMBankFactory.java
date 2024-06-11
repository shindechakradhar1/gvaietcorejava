package com.tnsif.bankapp.application;

import com.tnsif.bankapp.Framework.BankFactory;
import com.tnsif.bankapp.Framework.CurrentAccount;
import com.tnsif.bankapp.Framework.SavingAccount;

public class MMBankFactory extends BankFactory{
	@Override
	public CurrentAccount getCurrentAccount(int accountNumber, String accountName, float accountBalance,
			float creditLimit) {
		return new MMCurrentAccount(accountNumber, accountName, accountBalance, creditLimit) ;
	}
	
	@Override
	public SavingAccount getSavingAccount(int accountNumber, String accountName, float accountBalance,
			boolean isSalaried) {
		return new MMSavingAccount(accountNumber, accountName, accountBalance, isSalaried);
	}
}
