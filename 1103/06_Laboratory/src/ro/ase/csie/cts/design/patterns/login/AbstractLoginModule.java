package ro.ase.csie.cts.design.patterns.login;

public abstract class AbstractLoginModule {
	String ip;
	String url;
	
	public abstract void login(String username, String password);
}
