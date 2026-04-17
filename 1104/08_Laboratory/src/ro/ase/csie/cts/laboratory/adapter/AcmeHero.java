package ro.ase.csie.cts.laboratory.adapter;

public class AcmeHero extends AcmeAbstractHero{
	
	public AcmeHero(String name) {
		this.name = name;
		this.stamina = 100;
	}

	@Override
	public void walk() {
		System.out.println(this.name + " is moving around");

	}

	@Override
	public void takeAHit(int points) {
		System.out.println(this.name + " takes a hit of " + points);
		this.stamina -= points;
	}

}
