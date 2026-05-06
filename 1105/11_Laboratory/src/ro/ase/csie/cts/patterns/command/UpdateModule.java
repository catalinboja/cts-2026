package ro.ase.csie.cts.patterns.command;

public class UpdateModule implements IModuleActions{

	private String updateServerIp;
	private String currentVersion;
	
	public UpdateModule(String updateServerIp, String currentVersion) {
		super();
		this.updateServerIp = updateServerIp;
		this.currentVersion = currentVersion;
	}

	@Override
	public void doAction(String params) {
		System.out.println("Connect to " + this.updateServerIp);
		System.out.println("Update game data with params: " + params);
	}

}
