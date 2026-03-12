package ro.ase.csie.cts.clean.code.good;

import ro.ase.csie.cts.clean.code.good.interfaces.IAccounting;

public class Student {
	String name;
	
	IAccounting accounting = null;
	
	
	// dependency injection - technique
	// setter injection
	public void setAccounting(IAccounting accounting) {
		this.accounting = accounting;
	}
	
	// constructor injection
	public Student(String name, IAccounting accounting) {
		super();
		this.name = name;
	}



	public Student(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void payTuition(double value){ 
		//call-back the Accounting module action
		if(accounting != null) {
			accounting.payTuition(this, value);
		}
		else {
			throw new UnsupportedOperationException("Missing IAccounting reference");
		}
	}
	
	void takeOOPExam(){ }
	void saveToDB(){ }
	
}
