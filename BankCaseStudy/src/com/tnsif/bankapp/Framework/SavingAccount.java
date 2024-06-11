package com.tnsif.bankapp.Framework;

public abstract class SavingAccount extends BankAccount {

	private boolean isSalaried;
	private static final float MIN_BALANCE=500f;
	public SavingAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried) {
		super(accountNumber, accountName, accountBalance);
		this.isSalaried=isSalaried;
	}
	
//	@Override
//	public void deposit(float amount) {
//		if(amount>0)
//			super.setAccountBalance(this.getAccountBalance()+amount);
//		
//		System.out.println("Balace:" + this.getAccountBalance());
//	}
//
//	@Override
//	public void withdraw(float amount) {
//		float balance=this.getAccountBalance();
//		if(amount<balance && (balance-amount>=MIN_BALANCE))
//			this.setAccountBalance(balance-amount);
//		
//		System.out.println("Balance:" + this.getAccountBalance());
//	}

	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName() + ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
