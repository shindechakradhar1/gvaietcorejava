package casestudy1.bank.framework.main;

import casestudy1.bank.framework.BankAcc;
import casestudy1.bank.framework.BankFactory;
import casestudy1.bank.framework.MMBankFactory;

public class App {

	public static void main(String[] args) {
		BankFactory bankFactory = new MMBankFactory();
		
		BankAcc savingAcc = bankFactory.getSavingAcc(123, "abc", 10000, true);
		savingAcc.withdraw(100);
		savingAcc.withdraw(100);
		savingAcc.withdraw(10000);
		
		BankAcc currentAcc = bankFactory.getCurrentAcc(777, "Current", 15000, 50000);
		currentAcc.withdraw(64000);
		
		
	}
}
