package ro.ase.csie.cts.clean.code.good.accounting;

import ro.ase.csie.cts.clean.code.good.Student;
import ro.ase.csie.cts.clean.code.good.interfaces.IAccounting;

public class PayByCard implements IAccounting{

	/*
	 * 
	 * 
	 * 
	 * @description - payment by card implementation
	 * @param student - the Student reference that will make the payments
	 * @param value - the value of the payment
	 * 
	 */
	
	@Override
	public void payTuition(Student student, double value) {
		System.out.println(student.getName() + " pays by card");
		
	}

}
