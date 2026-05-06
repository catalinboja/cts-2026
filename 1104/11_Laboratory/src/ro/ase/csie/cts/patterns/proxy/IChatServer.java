package ro.ase.csie.cts.patterns.proxy;

public interface IChatServer {
	public abstract void sendMessage(
			String author, String destination, String message);
}
