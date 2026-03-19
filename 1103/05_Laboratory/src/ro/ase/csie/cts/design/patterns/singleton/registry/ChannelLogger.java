package ro.ase.csie.cts.design.patterns.singleton.registry;

public enum ChannelLogger {
	ERROR("error.log", 24), 
	INFO("info.log", 7*24), 
	STATUS("status.log", 31*24), 
	GAMEPLAY("gameplay.log", 1);
	
	private String filename;
	private float rotationTime;
	
	private ChannelLogger(String filename, float rotationTime) {
		this.filename = filename;
		this.rotationTime = rotationTime;
	}
	
	public void log(String msg) {
		System.out.println(this.filename + " <- " + msg);
	}
	
	
}
