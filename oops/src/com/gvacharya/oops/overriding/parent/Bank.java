package com.gvacharya.oops.overriding.parent;

public class Bank {

	private int accountNumber;
	private String accountHolderName;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(int accountNumber, String accountHolderName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public Bank printDetails() throws RuntimeException{
		System.out.println("Acc Number:" + accountNumber + " Acc Holder Name: " + accountHolderName);
		
		return new Bank();
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + "]";
	}

}
