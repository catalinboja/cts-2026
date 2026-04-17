package ro.ase.csie.cts.laboratory.adapter;

public class AcmeSuperhero extends AcmeAbstractHero{

	public AcmeSuperhero(String name) {
		this.name = name;
		this.stamina = 100;
	}
	
	@Override
	public void walk() {
		System.out.println(this.name + " is walking");
	}

	@Override
	public void takeAHit(int points) {
		this.stamina -= points;
		System.out.println(this.name + " loses points " + points);
	}

}
