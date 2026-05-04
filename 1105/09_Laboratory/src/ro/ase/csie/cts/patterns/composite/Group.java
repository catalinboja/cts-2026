package ro.ase.csie.cts.patterns.composite;

import java.util.ArrayList;

public class Group extends AbstractNPCGroup{
	
	ArrayList<AbstractNPCGroup> items = new ArrayList<>();
	String name;
	
	public Group(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		for(AbstractNPCGroup item : items) {
			item.move();
		}
	}

	@Override
	public void attack(String hero) {
		for(AbstractNPCGroup item : items) {
			item.attack(hero);
		}
	}

	@Override
	public int getAttackStrength() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addItem(AbstractNPCGroup item) {
		this.items.add(item);
	}

	@Override
	public void removeItem(AbstractNPCGroup item) {
		this.items.remove(item);
	}

	@Override
	public AbstractNPCGroup getItem(int index) {
		if(index < this.items.size()) {
			return this.items.get(index);
		}
		else return null;
	}

	
}








