package ro.ase.csie.cts.design.patterns.builder;

public class TestGame {

	public static void main(String[] args) {
		
		Superhero superman = 
				new Superhero.SuperheroBuilder("Superman")
				.build();
		
		Superhero batman = 
				new Superhero.SuperheroBuilder("Batman")
				.addPositiveKarma()
				.addShield(100)
				.addStamina(100)
				.build();
		
		
	}

}
