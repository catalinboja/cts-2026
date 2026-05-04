package ro.ase.csie.cts.patterns.facade;

public class GameServer {
	String ip;
	String name;
	
	public GameServer(String ip, String name) {
		super();
		this.ip = ip;
		this.name = name;
	}
	
	public void connect() {
		System.out.println("Connectig to " + ip);
	}
	
	
}
