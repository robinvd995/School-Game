package game;

import rendering.Display;

public class Launcher {
	
	public static void main(String[] args) {
		KeyGame game = new KeyGame("Test", 600, 400);
		game.run();
	}
}
