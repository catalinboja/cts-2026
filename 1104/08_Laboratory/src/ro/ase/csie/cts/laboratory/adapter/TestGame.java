package ro.ase.csie.cts.laboratory.adapter;

import ro.ase.csie.cts.laboratory.adapter.disney.DonaldHero;
import ro.ase.csie.cts.laboratory.adapter.disney.IDisneyHero;

public class TestGame {

	public static void main(String[] args) {
		
		AcmeAbstractHero superman = new AcmeHero("Superman");
		superman.walk();
		superman.takeAHit(10);
		
		IDisneyHero disneyHero = new DonaldHero();
		disneyHero.run(10);
		
		AcmeAbstractHero donald = new Disney2AcmeAdapter(disneyHero);
		donald.walk();
		donald.takeAHit(20);
		
		AcmeAbstractHero mickey = new Disney2AcmeAdapter(new DonaldHero());
		mickey.walk();
		
		
		
		
		
	}

}
