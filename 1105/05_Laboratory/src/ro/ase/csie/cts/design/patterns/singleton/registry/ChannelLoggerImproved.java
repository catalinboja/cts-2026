package ro.ase.csie.cts.design.patterns.singleton.registry;

import java.util.HashMap;

public class ChannelLoggerImproved {
	
	private static HashMap<String, ChannelLoggerImproved> loggers = 
			new HashMap<>();
	
	private ChannelLoggerImproved(String channel) {
		System.out.println("Creating a logger for " + channel);
	}
	
	public static ChannelLoggerImproved getLogger(String channel) {
		ChannelLoggerImproved logger = loggers.get(channel);
		if(logger == null) {
			logger = new ChannelLoggerImproved(channel);
			loggers.put(channel, logger);
		}
		return logger;
	}

}
