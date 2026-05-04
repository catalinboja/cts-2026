package ro.ase.csie.cts.patterns.composite;

import java.util.ArrayList;

public class Group extends AbstractNPCGroup{
	
	protected String name;
	ArrayList<AbstractNPCGroup> items = new ArrayList<>();
	
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
	public void attack(String player) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getName() {
		return this.name;
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
		return null;
	}

}
