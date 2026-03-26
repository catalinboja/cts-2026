package ro.ase.csie.cts.design.pattern.builder;

public class TestGame {

	public static void main(String[] args) {
		
		Superhero superman = new Superhero.SuperheroBuilder("Superman")
				.build();
		
		Superhero superman2 = new Superhero.SuperheroBuilder("Superman")
				.addStamina(100)
				.hasGoodKarma()
				.addSuperPower("Laser eyes")
				.addWeapon("Power fist")
				.build();
		
		Superhero superman3 = new Superhero.SuperheroBuilder("Superman")
				.addStamina(100)
				.hasGoodKarma()
				.addSuperPower("Laser eyes")
				.addWeapon("Power fist")
				.build();
		
		Superhero superman4 = HeroesDirector.createSuperman();
		
	}

}
