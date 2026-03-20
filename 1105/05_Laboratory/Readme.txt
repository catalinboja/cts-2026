
1. The game server must provide a single shared match configuration object used by all modules. Because not all game modes require this configuration, the object must be created only when it is requested for the first time.

2. The game server must provide a single shared file logger used by all modules. Because startup events and initialization failures must also be recorded, the logger must be created and fully initialized during application boot. The logger implements ILogging. The logging service must be available immediately after the game server starts, because the platform must record startup events, configuration loading issues, and initialization failures that may occur before normal gameplay begins.

3. The platform must provide unique loggers for predefined channels such as ERROR, INFO, STATUS, and GAMEPLAY. For each channel, all requests must return the same logger instance and the same output file. Only the predefined channels may exist.