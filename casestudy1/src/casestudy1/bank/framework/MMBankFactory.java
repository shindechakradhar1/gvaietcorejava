package casestudy1.bank.framework;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		return new SavingAccMM(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public CurrentAcc getCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		return new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
	}
}
