package ro.ase.csie.cts.patterns.facade;

public class GameServer {

	private String IP;
	private String name;
	
	public GameServer(String iP, String name) {
		super();
		IP = iP;
		this.name = name;
	}

	public String getIP() {
		return IP;
	}

	public String getName() {
		return name;
	}
	
}
