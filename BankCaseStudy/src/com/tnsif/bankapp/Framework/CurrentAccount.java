package com.tnsif.bankapp.Framework;

public abstract class CurrentAccount extends BankAccount{

	private final float creditLimit;

	public CurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance);
		this.creditLimit=creditLimit;
	}
	
	public float getCreditLimit() {
		return creditLimit;
	}



//	@Override
//	public void withdraw(float amount) {
//		float balance=this.getAccountBalance();
//		if(amount-balance<creditLimit)
//			this.setAccountBalance(balance-amount);
//		System.out.println("Balance:" + this.getAccountBalance());
//	}
//	
//	@Override
//	public void deposit(float amount) {
//		float balance=this.getAccountBalance();
//		this.setAccountBalance(amount+balance);
//		
//		System.out.println("Balance:" + this.getAccountBalance());
//	}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName() + ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
