package ro.ase.csie.cts.design.patterns.factory;

public class SpaceshipFactory {
	public static AbstractSpaceship getSpaceship(
			SpaceshipType type, String name) {
		switch(type) {
		case FEDERATION:
			return new FederationSpaceship(name, false, 1);
		case ROMULAN:
			return new RomulanSpaceship(name, 100);
		default:
			throw new UnsupportedOperationException();
		}
	}
}
