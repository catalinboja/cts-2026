package ro.ase.csie.cts.course.design.patterns.builder.initial;

import ro.ase.csie.cts.course.design.patterns.builder.module.InterfaceSIMCard;
import ro.ase.csie.cts.course.design.patterns.builder.module.TelCoSIMCard;

public class Main {

	public static void main(String[] args) {
		
		
		//it's not an atomic operation
		
		SmartDevice phone = new SmartDevice();
		
		//TODO: Don't forget to init
		phone.setModel("S26");
		phone.setProducator("Samsung");
		//....
		//...you will forget an attribute or more
		
		InterfaceSIMCard simCard = new TelCoSIMCard();
		
		
		//it's an atomic operation
		//it is requiring information that will not be needed
		
		SmartDevice iphone = new SmartDevice("I17", "Apple", true, 
				simCard, null, null, null);
		
	}

}
