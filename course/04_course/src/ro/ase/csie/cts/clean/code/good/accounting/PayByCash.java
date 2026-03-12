package ro.ase.csie.cts.clean.code.good.accounting;

import ro.ase.csie.cts.clean.code.good.Student;
import ro.ase.csie.cts.clean.code.good.interfaces.IAccounting;

public class PayByCash implements IAccounting{

	@Override
	public void payTuition(Student student, double value) {
		System.out.println(student.getName() + " pays by cash");
	}

}
