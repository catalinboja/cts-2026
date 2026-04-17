package ro.ase.csie.cts.laboratory.adapter;

import ro.ase.csie.cts.laboratory.adapter.disney.DonaldHero;
import ro.ase.csie.cts.laboratory.adapter.disney.IDisneyHero;

public class TestGame {

	public static void main(String[] args) {
		
		AcmeAbstractHero hero = new AcmeSuperhero("Superman");
		hero.walk();
		hero.takeAHit(10);
		
		IDisneyHero donald = new DonaldHero();
		donald.moveOnScreen(10);
		
		hero = new Disney2AcmeAdapter(donald);
		hero.walk();
		hero.takeAHit(10);
		
		hero = new Disney2AcmeAdapter(new DonaldHero());
		
	}

}
