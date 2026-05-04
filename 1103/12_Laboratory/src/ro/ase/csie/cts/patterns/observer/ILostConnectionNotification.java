package ro.ase.csie.cts.patterns.observer;

public interface ILostConnectionNotification {
	public abstract void notify(long timestamp);
}
