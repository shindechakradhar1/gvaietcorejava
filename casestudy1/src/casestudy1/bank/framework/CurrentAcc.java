package casestudy1.bank.framework;

public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
	}
	
	@Override
	public void withdraw(float amount) {
		float bal = getAccBal();
		if(bal-amount<bal+creditLimit)
			super.withdraw(amount);
		else
			System.out.println(getAccBal() + " Insufficient Balance" );
		
		System.out.println("Account Balance is" + getAccBal());
	}	
}
