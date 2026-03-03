package ro.ase.csie.cts.laboratory.main;

import ro.ase.csie.cts.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.laboratory.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.laboratory.models.Bank;
import ro.ase.csie.cts.laboratory.models.BankAccount;
import ro.ase.csie.cts.laboratory.models.SavingsAccount;
import ro.ase.csie.cts.laboratory.models.enums.AccountType;

public class TestApp {
	
	
	public static void testInsufficientFundsException() throws InsufficientFundsException {
		throw new InsufficientFundsException("Not enough money");
	}
	
	public static void testIllegalTransferException() {
		throw new IllegalTransferException();
	}

	public static void main(String[] args) {

		try {
			testInsufficientFundsException();
		} catch (InsufficientFundsException e) {
			//e.printStackTrace();
			System.out.println("We have an issue");
		}
		
		//testIllegalTransferException();
		
		Bank acmeBank = new Bank("ACME");
		BankAccount savings = acmeBank.openAccount(AccountType.SAVINGS);
		BankAccount current = acmeBank.openAccount(AccountType.CURRENT);
		
		System.out.println("Savings account balance: " + savings.getBalance());
		
		System.out.println("The end");
		
	}

}
