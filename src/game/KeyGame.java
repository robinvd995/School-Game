package game;

import rendering.Display;

public class KeyGame implements Runnable{
	private int width, height;
	public String title;
	
	private Display display;
	
	public KeyGame(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height = height;
		
		
	}

	@Override
	public void run() {
		init();
	}
	
	public void init(){
		display = new Display(title, width, height);
	}
	
	
	
	
}
