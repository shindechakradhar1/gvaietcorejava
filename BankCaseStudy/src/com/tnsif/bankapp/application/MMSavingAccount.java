package com.tnsif.bankapp.application;

import java.util.function.Predicate;

import com.tnsif.bankapp.Framework.SavingAccount;

public class MMSavingAccount extends SavingAccount{

	private static final float MIN_BALANCE=500f;
	public MMSavingAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried) {
		super(accountNumber, accountName, accountBalance, isSalaried);
	}

	@Override
	public void withdraw(float amount) {
		float balance=this.getAccountBalance();
		Predicate<Float> withDrawTest = amount1->amount1<=balance && (balance-amount1>=MIN_BALANCE);
		if(withDrawTest.test(amount)) {
			this.setAccountBalance(balance-amount);
			System.out.println("Successfull");
		}else {
			System.out.println("Insufficient funds.");
		}
		
		System.out.println("Balance:" + this.getAccountBalance());
	}
	
	@Override
	public void deposit(float amount) {
		if(amount>0)
			super.setAccountBalance(this.getAccountBalance()+amount);
		
		System.out.println("Balace:" + this.getAccountBalance());
	}

	@Override
	public String toString() {
		return "MMSavingAccount [toString()=" + super.toString() + "]";
	}
	
	
}
