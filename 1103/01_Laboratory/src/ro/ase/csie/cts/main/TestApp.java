package ro.ase.csie.cts.main;

import ro.ase.csie.cts.exceptions.IllegalTransferException;
import ro.ase.csie.cts.exceptions.InsufficientFundsException;
import ro.ase.csie.cts.models.Account;

public class TestApp {
	
	public static void testIllegalTransfer() {
		System.out.println("Test Illegal transfer");
		throw new IllegalTransferException();
	}
	
	public static void testInsufficientFunds() throws InsufficientFundsException {
		System.out.println("Test Insufficient funds");
		throw new InsufficientFundsException("Not enough money !");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testIllegalTransfer();
		
		try {
			testInsufficientFunds();
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Account account = new Account();
	}

}
