1. During the game the client may lose the connection to the server (for various reasons). When this happens,the different modules in the game must react accordingly
- the game instance must be saved on the client
- character attributes must be saved
- the gamer must be notified
- the connection must be retried


2. The game client must perform tasks in the background without interfering with the development of the game (without blocking or slowing it down)
- customer data backup
- receive updates for the forum
- update 3D models in silent mode (during the game)
- a solution must be found through which these tasks can be executed without affecting the execution of the game. 
These routines can be executed in any order during the gameplay.

3. When a player joins a ranked match, the request must pass through several validation steps such as authentication, anti-cheat verification, network quality checks, and ranking validation. Each step may accept, reject, or forward the request to the next validation component.