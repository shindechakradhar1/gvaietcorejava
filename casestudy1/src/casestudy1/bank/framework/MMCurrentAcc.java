package casestudy1.bank.framework;

public class MMCurrentAcc extends CurrentAcc{
	
	private final float creditLimit;

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		this.creditLimit=creditLimit;
	}

	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
	}
	
	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		
	}

}
