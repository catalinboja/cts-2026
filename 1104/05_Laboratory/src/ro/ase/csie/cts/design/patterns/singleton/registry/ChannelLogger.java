package ro.ase.csie.cts.design.patterns.singleton.registry;

public enum ChannelLogger {
	ERROR("error.log", "ERROR"),
	INFO("info.log", "INFO"),
	STATUS("status.log", "STATUS"),
	GAMEPLAY("all.log", "-");
	
	private String filename;
	private String tag;
	
	private ChannelLogger(String file, String tag) {
		this.filename = file;
		this.tag = tag;
	}
	
	public void log(String msg) {
		System.out.println(this.filename + " <-- " + this.tag + "-" + msg);
	}
}





