package ro.ase.csie.cts.patterns.composite;

public class NPC extends AbstractNPCGroup{

	
	protected String name;
	protected int attackStrength;
	
	public NPC( String name, int attackStrength) {
		this.name = name;
		this.attackStrength = attackStrength;
	}
	
	@Override
	public void move() {
		System.out.println(this.name + " moves");
	}

	@Override
	public void attackHero(String hero) {
		System.out.println(this.name + " attacks " + hero);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void addItem(AbstractNPCGroup item) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeItem(AbstractNPCGroup item) {
		throw new UnsupportedOperationException();
	}

	@Override
	public AbstractNPCGroup getItem(int index) {
		throw new UnsupportedOperationException();
	}

}
