package com.gvacharya.oops.test;

public abstract class Bank {

	public final int i=0;
	public Bank printMessage(String msg) throws RuntimeException{
		System.out.println(msg + " parent");
		
		return new SBI();
	}
	
	public static void main(String[] args) {
		Bank bank = new SBI();
		System.out.println(bank.toString());
		
		bank.sum();
		System.out.println();
	}
	
	public static final int sum(int number) {
		if(number==1)
		 return 0;
		return 5*sum(--number);
	}
	
	public void sum() {
		final int i=0;
		System.out.println("dsjfalksdfjklj");
		
		
		Bank bank1 = new Bank() 
		{
			@Override
			public void display() {
				
			}
		};
		
		
		bank1.display();
	}
	
	public abstract void display();

}
