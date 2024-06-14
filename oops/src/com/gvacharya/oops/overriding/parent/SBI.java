package com.gvacharya.oops.overriding.parent;

import java.time.DateTimeException;
import java.util.EmptyStackException;

public class SBI extends Bank {

	private boolean kyc;

	public SBI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SBI(int accountNumber, String accountHolderName) {
		super(accountNumber, accountHolderName);
		// TODO Auto-generated constructor stub
	}

	public SBI(boolean kyc) {
		super();
		this.kyc = kyc;
	}

	public boolean isKyc() {
		return kyc;
	}

	public void setKyc(boolean kyc) {
		this.kyc = kyc;
	}
	
//	@Override
	public SBI printDetails() throws DateTimeException {
		System.out.println("acc Number:" + getAccountNumber() + " Acc HolderName : " + getAccountHolderName() + " KYC:" + kyc);
		return new SBI();
	}

	@Override
	public String toString() {
		return "SBI [kyc=" + kyc + "]";
	}

}
