package com.tnsif.bankapp.Framework;

public abstract class BankAccount {

	private int accountNumber;
	private String accountName;
	private float accountBalance;

	protected BankAccount() {
	}

	protected BankAccount(int accountNumber, String accountName, float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

//	public void deposit(float amount) {
//		if(amount>0)
//			accountBalance+=amount;
//		System.out.println("Balace:" + accountBalance);
//	}
//
//	public void withdraw(float amount) {
//		if(amount<accountBalance && accountBalance-amount>0)
//			accountBalance-=amount;
//		System.out.println("Balance:" + accountBalance);
//	}
	
	public abstract void deposit(float amount);
	
	public abstract void withdraw(float amount);
	
	@Override
	public String toString() {
		return "BankAcc [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + "]";
	}
}
