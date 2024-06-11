package casestudy1.bank.framework;

public class SavingAccMM extends SavingAcc{

	private static final float MINBAL=10000;

	public SavingAccMM(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
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
