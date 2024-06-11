package casestudy1.bank.framework;

public interface BankFactory {

	SavingAcc getSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried);
	CurrentAcc getCurrentAcc(int accNo,String accNm,float accBal,float creditLimit);
}
