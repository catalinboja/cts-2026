package ro.ase.csie.cts.patterns.command;

public class BackupModule implements IModuleActions{
	
	private String version;

	public BackupModule(String version) {
		super();
		this.version = version;
	}

	@Override
	public void doAction(String params) {
		System.out.println("Backup game client data...");
		System.out.println("Using config: " + params);
	}
	
}
