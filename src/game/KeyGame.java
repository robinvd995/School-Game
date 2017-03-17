package game;

import input.Movement;
import rendering.Display;

public class KeyGame implements Runnable{
	private int width, height;
	public String title;
	
	private Display display;
	private static Movement movement;
	
	public KeyGame(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
		movement = new Movement();		
	}

	@Override
	public void run() {
		init();
	}
	
	public void init(){
		display = new Display(title, width, height);
		
	}
	
	public static Movement getMovement() {
		return movement;
	}	
}
