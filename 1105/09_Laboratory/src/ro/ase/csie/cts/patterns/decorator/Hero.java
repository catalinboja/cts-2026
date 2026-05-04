package ro.ase.csie.cts.patterns.decorator;

public class Hero extends AbstractHero{

	public Hero(String name) {
		super(name);
	}

	@Override
	public void move(int distance) {
		System.out.println(this.name + " moves for " + distance + " pixels");
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(this.name + " takes a hit of " + points);
		this.stamina -= points;
	}
	
	

}
