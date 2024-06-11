package casestudy1.bank.framework;

public abstract class SavingAcc extends BankAcc{

	private boolean isSalaried;
	private static final float MINBAL=10000F;
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	
	public static float getMinbal() {
		return MINBAL;
	}
	
	public void withdraw(float amount) {
		float bal=getAccBal();
		if(MINBAL<bal-amount)
			super.withdraw(amount);
		else
			System.out.println(getAccBal() + " Insufficient Balance");
				
		System.out.println("Account Balance is: " + getAccBal());
	}
	
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
}
