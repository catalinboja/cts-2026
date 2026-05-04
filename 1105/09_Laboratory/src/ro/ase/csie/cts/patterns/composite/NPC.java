package ro.ase.csie.cts.patterns.composite;

public class NPC extends AbstractNPCGroup{
	
	String name;
	int attackStrength;
	
	public NPC(String name, int attackStrength) {
		this.name = name;
		this.attackStrength = attackStrength;
	}

	@Override
	public void move() {
		System.out.println(this.name + " NPC moves");
	}

	@Override
	public void attack(String hero) {
		System.err.println(this.name + " attacks " + hero);
	}

	@Override
	public int getAttackStrength() {
		return this.attackStrength;
	}

	@Override
	public void addItem(AbstractNPCGroup item) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeItem(AbstractNPCGroup item) {
		throw new UnsupportedOperationException();
	}

}
