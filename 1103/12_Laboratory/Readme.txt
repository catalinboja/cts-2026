1. The game has an internal chat and players can send messages to others
- we want to filter comments / messages that are not appropriate; those messages will be dropped and not sent
- the chat server is managed by a different company and we don't have access to the source code

2. Players can pay their monthly subscription in different ways (paypal, bank card, crypto). The payment is done automatically each month based on the user preferences. Find a way to implement the payment action based on user settings without asking the player each month. Take into account that new payments methods could be introduced in the future.

3. During the game the client may lose the connection to the server (for various reasons). When this happens,the different modules in the game must react accordingly
- the game instance must be saved on the client
- character attributes must be saved
- the gamer must be notified
- the connection must be retried
