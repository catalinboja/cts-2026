package ro.ase.csie.cts.design.patterns.factory;

public class RomulanSpaceship extends AbstractSpaceship{

	private int phasersPower;

	public RomulanSpaceship(String name, int phasersPower) {
		this.name = name;
		this.phasersPower = phasersPower;
	}
	
	
}
