package com.tnsif.bankapp.application;

import com.tnsif.bankapp.Framework.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount{

	public MMCurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance, creditLimit);
	}
	
	@Override
	public void withdraw(float amount) {
		float balance=this.getAccountBalance();
		if(amount-balance<this.getCreditLimit()) {
			this.setAccountBalance(balance-amount);
			System.out.println("successfull");
		}else {
			System.out.println("insufficient funds");
		}
		balance = this.getAccountBalance();
		System.out.println("Balance:" + balance);
		System.out.println("Credit Limit:" + (getCreditLimit()+balance));
		
	}
	
	@Override
	public void deposit(float amount) {
		float balance=this.getAccountBalance();
		this.setAccountBalance(amount+balance);
		
		System.out.println("Balance:" + this.getAccountBalance());
	}

	@Override
	public String toString() {
		return "MMCurrentAccount [toString()=" + super.toString() + "]";
	}

}
