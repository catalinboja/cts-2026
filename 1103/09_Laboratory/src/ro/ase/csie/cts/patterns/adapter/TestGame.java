package ro.ase.csie.cts.patterns.adapter;

import ro.ase.csie.cts.patterns.adapter.disney.DonaldDuck;
import ro.ase.csie.cts.patterns.adapter.disney.IDisneyHero;

public class TestGame {

	public static void main(String[] args) {
		
		AbstractAcmeHero superman = new AcmeHero("Superman");
		superman.walk();
		superman.takeAHit(10);
		
		IDisneyHero donald = new DonaldDuck();
		donald.run(10);
		
		AbstractAcmeHero adaptedDonald = new Disney2AcmeAdapter(donald);
		adaptedDonald.walk();
		adaptedDonald.takeAHit(20);
		
		superman = adaptedDonald;
		
		superman = new Disney2AcmeAdapter(new DonaldDuck());
		superman.walk();
		
		
		
	}

}





