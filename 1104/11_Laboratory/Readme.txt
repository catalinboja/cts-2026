1. To efficiently manage (from a memory point of view) scenarios in which players interact with multiple computer-controlled characters find a solution based on:
- the collection of computer-coordinated characters contains elements of the same kind (the same 3D models)
- the space occupied by a 3D model is significant
- generating such a scenario requires a significant memory space for the client
- 3D models are displayed on the screen at different coordinates and can have textures of different colors
- an efficient solution must be found regarding the management of these situations

The game must handle thousands of similar objects (e.g., bullets, trees, particles). Storing full data for each object consumes too much memory. The solution must reuse shared data while allowing each object to keep its own unique runtime state.


2. The game has an internal chat and players can send messages to others
- we want to filter comments / messages that are not appropriate; those messages will be dropped and not sent
- the chat server is managed by a different company and we don't have access to the source code

3. The game uses complex 3D objects that are expensive to load. To improve performance, these objects must be loaded only when needed (when the player zooms on an object or gets closer to it), while the system temporarily uses lightweight placeholders (objects with less details) so that gameplay is not interrupted.

4. Players can pay their monthly subscription in different ways (paypal, bank card, crypto). The payment is done automatically each month based on the user preferences. Find a way to implement the payment action based on user settings without asking the player each month. Take into account that new payments methods could be introduced in the future.
