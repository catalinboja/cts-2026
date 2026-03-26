package ro.ase.csie.cts.design.pattern.factory;

public class SpaceshipFactory {
	public static AbstractSpaceship getSpaceship(SpaceshipType type) {
		switch(type) {
			case FIGHTER:
				return new Fighter("Viper1");
			case DESTROYER:
				return new Destroyer();
			default:
					throw new UnsupportedOperationException();
		}
	}
}
