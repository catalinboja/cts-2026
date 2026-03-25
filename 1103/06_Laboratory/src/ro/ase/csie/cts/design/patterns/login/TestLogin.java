package ro.ase.csie.cts.design.patterns.login;

public class TestLogin {

	public static void main(String[] args) {
		LoginModule login = LoginModule.getModule();
		login.login("admin", "1234");
	}

}
