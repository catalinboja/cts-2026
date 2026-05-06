package ro.ase.csie.cts.patterns.observer;

public interface INetworkActions {
	public abstract void connectionLost(Long timestamp);
	public abstract void connectionUp();
}
