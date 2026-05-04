package ro.ase.csie.cts.patterns.facade;

public class UserCredentials {

	private String name;
	private String pass;
	
	public UserCredentials(String name, String pass) {
		super();
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public String getPass() {
		return pass;
	}
	
}
