package ro.ase.csie.cts.design.patterns.builder;

public class HeroesDirector {
	public static Superhero createSuperman() {
		return new Superhero.SuperheroBuilder("Superman")
				.addStamina(100)
				.addPower(1000)
				.isWounded()
				.hasGoodKarma()
				.addSuperpower("Laser eyes")
				.build();
	}
	
	public static Superhero createBatman() {
		return new Superhero.SuperheroBuilder("Batman")
				.addStamina(100)
				.addPower(100)
				.isWounded()
				.hasGoodKarma()
				.build();
	}
}
