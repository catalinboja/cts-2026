package ro.ase.csie.cts.design.patterns.lazy.singleton;

public class MatchSettings {
	
	private static MatchSettings settings = null;
	
	private float maxDuration;
	private int maxPlayers;
	private int noPlayers;
	private String mapName;
	
	private MatchSettings() {
		System.out.println("Reading game config file....");
		this.maxDuration = 60;
		this.maxPlayers = 100;
		this.noPlayers = 0;
		this.mapName = "CityCentra;";
	}
	
	public static synchronized MatchSettings getSettings() {
		if(MatchSettings.settings == null) {
			MatchSettings.settings = new MatchSettings();
		}
		return MatchSettings.settings;
	}
	
}






