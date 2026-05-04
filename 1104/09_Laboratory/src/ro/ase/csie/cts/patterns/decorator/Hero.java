package ro.ase.csie.cts.patterns.decorator;

public class Hero extends AbstractHero{
	
	public Hero(String name) {
		this.name = name;
		this.stamina = 100;
	}

	@Override
	public void move(int distance) {
		System.out.println(this.name + " moves for " + distance + " pixels");
	}

	@Override
	public void takeAHit(int points) {
		System.out.println(this.name + " is hit. Loses " + points + " points");
		this.stamina -= points;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}



