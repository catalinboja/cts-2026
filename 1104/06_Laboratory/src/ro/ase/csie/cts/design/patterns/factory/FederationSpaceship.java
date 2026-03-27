package ro.ase.csie.cts.design.patterns.factory;

public class FederationSpaceship extends AbstractSpaceship {
	
	private boolean hasActiveShields;

	public FederationSpaceship(String name, boolean hasActiveShields, int crew) {
		this.name = name;
		this.hasActiveShields = hasActiveShields;
	}
	
	

}
