package ro.ase.csie.cts.laboratory.main;

import ro.ase.csie.cts.laboratory.exceptions.IllegalTransferException;
import ro.ase.csie.cts.laboratory.exceptions.InsufficientFundsException;

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
		
		testIllegalTransferException();
		
		System.out.println("The end");
		
	}

}
