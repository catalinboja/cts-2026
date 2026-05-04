package ro.ase.csie.cts.patterns.composite;

public abstract class AbstractNPCGroup 
	implements INPCActions, IGroupActions{

	public abstract void addItem(AbstractNPCGroup item);
	public abstract void removeItem(AbstractNPCGroup item);
	public AbstractNPCGroup getItem(int index) {
		throw new UnsupportedOperationException();
	}
}
