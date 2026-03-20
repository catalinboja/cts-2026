package ro.ase.csie.cts.design.patterns.singleton.registry;

import java.util.HashMap;

public class ChannelLoggerImproved {
	
	private static HashMap<String, ChannelLoggerImproved> loggers = 
			new HashMap<>();
	
	private String filename;
	private String tag;
	
	private ChannelLoggerImproved(String channel) {
		System.out.println("Creating logger for " + channel);
		
	}
	
	public static synchronized ChannelLoggerImproved getLogger(String channel) {
		ChannelLoggerImproved logger = loggers.get(channel);
		
		if(logger == null) {
			logger = new ChannelLoggerImproved(channel);
			loggers.put(channel, logger);
		}
		
		return logger;		
	}
}






