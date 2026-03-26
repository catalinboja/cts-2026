package ro.ase.csie.cts.design.pattern.factory;

public class TestGame {

	public static void main(String[] args) {
		
		AbstractSpaceship fighter = 
				SpaceshipFactory.getSpaceship(SpaceshipType.FIGHTER);
		AbstractSpaceship destroyer = 
				SpaceshipFactory.getSpaceship(SpaceshipType.DESTROYER);
	}

}
