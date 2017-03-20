package game;

import input.InputManager;
import rendering.Display;

public class KeyGame implements Runnable{
	
	private Display display;
	public String title;
	public int width, height;
	
	private boolean playing = false;
	private Thread thread;
	//private static Movement movement;
	
	private InputManager inputManager;
	
	public KeyGame(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		display = new Display(title, width, height);
		
		//movement = new Movement();		
		
		inputManager = new InputManager();
	}

	@Override
	public void run() {
		init();
		
		while(playing){
			tick();
			render();
		}
		
		stop();
	}
	
	private void tick(){

	}
	
	private void render(){
		
	}
	
	public void init(){
		display.createDisplay();
		inputManager.initKeys();
		display.addKeyListener(inputManager);
	}
	
	public synchronized void start(){
		if(playing){
			return;
		}
		playing = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if(!playing){
			return;
		}
		playing = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/*public static Movement getMovement() {
		return movement;
	}*/	
}
