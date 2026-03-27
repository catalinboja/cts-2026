package ro.ase.csie.cts.design.patterns.factory;

public class TestGame {

	public static void main(String[] args) {
		
//		AbstractSpaceship federation1 = 
//				new FederationSpaceship("Victory", true);
		
		AbstractSpaceship federation2 = 
				SpaceshipFactory.getSpaceship(
						SpaceshipType.FEDERATION, "Victory");
		AbstractSpaceship romulan1 = 
				SpaceshipFactory.getSpaceship(
						SpaceshipType.ROMULAN, "REtrYy");
		
		
	}

}
