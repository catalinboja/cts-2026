package ro.ase.csie.cts.design.patterns.singleton.registry;

public enum ChannelLogger {
	ERROR("errors.log", "ERROR"),
	INFO("info.log", "INFO"), 
	STATUS("status.log", "STATUS"), 
	GAMEPLAY("general.log", "-");
	
	private String logFile;
	private String tag;
	
	private ChannelLogger(String filename, String tag) {
		this.logFile = filename;
		this.tag = tag;
	}
	
	public void log(String msg) {
		System.out.println("Logging into " + this.logFile);
		System.out.println(this.tag + " " + msg);
	}
	
}
