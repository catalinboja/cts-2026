package ro.ase.csie.cts.design.pattern.builder;

public class HeroesDirector {

	public static Superhero createSuperman() {
		return new Superhero.SuperheroBuilder("Superman")
				.addStamina(100)
				.hasGoodKarma()
				.addSuperPower("Laser eyes")
				.addWeapon("Power fist")
				.build();
	}
}
