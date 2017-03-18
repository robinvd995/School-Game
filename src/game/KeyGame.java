package game;

import entity.Player;
import input.InputManager;
import rendering.Display;

public class KeyGame implements Runnable{
	
	private Display display;
	//private static Movement movement;
	
	private InputManager inputManager;
	
	public KeyGame(String title, int width, int height){
		display = new Display(title, width, height);
		
		//movement = new Movement();		
		
		inputManager = new InputManager();
	}

	@Override
	public void run() {
		init();
	}
	
	public void init(){
		display.createDisplay();
		inputManager.initKeys();
		display.addKeyListener(inputManager);
	}
	
	/*public static Movement getMovement() {
		return movement;
	}*/	
}
