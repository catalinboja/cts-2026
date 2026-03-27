package ro.ase.csie.cts.design.patterns.builder;

public class TestGame {

	public static void main(String[] args) {

		Superhero superman = 
				new Superhero.SuperheroBuilder("Superman").build();
		
		Superhero superman2 = 
				new Superhero.SuperheroBuilder("Superman")
				.addStamina(100)
				.addPower(1000)
				.isWounded()
				.hasGoodKarma()
				.addSuperpower("Laser eyes")
				.build();
		
		Superhero superman3 = 
				new Superhero.SuperheroBuilder("Superman")
				.addStamina(100)
				.addPower(1000)
				.isWounded()
				.hasGoodKarma()
				.addSuperpower("Laser eyes")
				.build();
		
		Superhero superman4 = 
				HeroesDirector.createSuperman();
	}

}
