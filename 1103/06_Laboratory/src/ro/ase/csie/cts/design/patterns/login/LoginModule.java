package ro.ase.csie.cts.design.patterns.login;

public class LoginModule extends AbstractLoginModule {

	private static LoginModule module;
	
	private LoginModule() {
		System.out.println("Init login module...");
		this.ip = "127.0.0.1";
		this.url = "online.ase.ro";
	}
	
	@Override
	public void login(String username, String password) {
		System.out.println("Login for " + username);
	}
	
	public static LoginModule getModule() {
		if(LoginModule.module == null) {
			LoginModule.module = new LoginModule();
		} 
		return LoginModule.module;
	}

}






