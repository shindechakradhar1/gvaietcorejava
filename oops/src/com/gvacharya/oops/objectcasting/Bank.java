package com.gvacharya.oops.objectcasting;

public class Bank {

	private long accNo;
	private String accType;
	
	public Bank(long accNo, String accType) {
		this.accNo = accNo;
		this.accType = accType;
	}
	
	public Bank() {}
	
	public long getAccNo() {
		return accNo;
	}
	
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	public String getAccType() {
		return accType;
	}
	
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	
	public void printAccountDetails() {
		System.out.println("Bank" +"AccNo:" + accNo + " Account Type:" + accType);
	}
	
	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", accType=" + accType + "]";
	}
}
