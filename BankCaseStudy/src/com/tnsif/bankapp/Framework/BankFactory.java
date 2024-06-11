package com.tnsif.bankapp.Framework;

public abstract class BankFactory {

	public abstract SavingAccount getSavingAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried);
	public abstract CurrentAccount getCurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit);
}
