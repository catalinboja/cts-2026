package ro.ase.csie.cts.laboratory.main;

import ro.ase.csie.cts.laboratory.enums.AccountType;
import ro.ase.csie.cts.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.laboratory.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.laboratory.models.Bank;

public class TestApp {
	
	public static void testCheckedException() throws InsufficientFundsException {
		throw new InsufficientFundsException();
	}
	
	public static void testRuntimeException() {
		throw new IllegalTransferException();
	}

	public static void main(String[] args) {

		//test exceptions
		try {
			testCheckedException();
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		
		//testRuntimeException();
		
		Bank bank = new Bank("ACME");
		bank.openAccount(AccountType.SAVINGS);
		bank.openAccount(AccountType.CURRENT);
		
		System.out.println("The end");
		
	}

}
