package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import input.InputManager;
import rendering.Display;

public class KeyGame extends JFrame implements Runnable{
	
	private Display display;
	public String title;
	public int width, height;
	
	private BufferedImage backBuffer;
	
	private Graphics g;
	private Graphics bbg;
	
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
//		draw();		
	}	
//	public void draw(){
//		g = getGraphics();
//		bbg = backBuffer.getGraphics();
//		
//		bbg.setColor(Color.BLACK);
//		bbg.fillRect(10, 10, 80, 160);
//		
//		g.drawImage(backBuffer, 100, 100, this);
//		
//	}
	
	public void init(){
		display.createDisplay();
		inputManager.initKeys();
		display.addKeyListener(inputManager);
		
		//backBuffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	}
		
	/*public static Movement getMovement() {
		return movement;
	}*/	
}
