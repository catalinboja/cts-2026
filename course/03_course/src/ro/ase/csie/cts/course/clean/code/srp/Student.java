package ro.ase.csie.cts.course.clean.code.srp;

public class Student {
	
	IAccounting accounting = null;
	
	// setter injection
	public void setAccounting(IAccounting accountingRef) {
		this.accounting = accountingRef;
	}
	
	// constructor injection
	// doesn't look ok in this case
	public Student(String name, IAccounting accountingRef) {
		this.accounting = accountingRef;
	}
	
	String getName(){ return "John Doe";}
	
	// remove dependency on Accounting by using the external ref
	void payTuition(){ 
		if(accounting != null) {
			accounting.payTuition();
		}
	}
	void takeOOPExam(){ 
		// implementation of taking exam
	}
	void saveToDB(){ 
		// implementation of saving data to DB
	}

}
