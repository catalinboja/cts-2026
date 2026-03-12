package ro.ase.csie.cts.clean.code.good.main;

import ro.ase.csie.cts.clean.code.good.Student;
import ro.ase.csie.cts.clean.code.good.accounting.PayByCard;
import ro.ase.csie.cts.clean.code.good.accounting.PayByCash;
import ro.ase.csie.cts.clean.code.good.containers.DependencyContainer;
import ro.ase.csie.cts.clean.code.good.interfaces.IAccounting;

public class Test {

	public static void main(String[] args) {
		
		//create the dependency container
		DependencyContainer iocContainer = new DependencyContainer();
		//register the IAccounting implementation
		iocContainer.register(IAccounting.class, new PayByCard());
		iocContainer.register(IAccounting.class, new PayByCash());
		
		Student john = new Student("John");
		Student alice = new Student("Alice");
		
		//john.setAccounting(new PayByCard());
		//john.setAccounting(new PayByCash());
		//alice.setAccounting(new PayByCash());
		
		john.setAccounting(iocContainer.resolve(IAccounting.class));
		alice.setAccounting(iocContainer.resolve(IAccounting.class));
		
		john.payTuition(1000);
		alice.payTuition(1000);
		
	}

}
