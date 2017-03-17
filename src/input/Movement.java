package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import game.EnumDirection;

public class Movement implements KeyListener {
	
	private EnumDirection arrowKeys;
	public boolean [] keys;
	public boolean up, down, left, right;
	
	public Movement(){
		keys = new boolean [4];
	}
	
//	public void setKeys(){				
//		switch(arrowKeys){
//		case UP:
//			up = keys[KeyEvent.VK_UP];
//			break;
//		case DOWN:
//			down = keys[KeyEvent.VK_DOWN];
//			break;
//		case LEFT:
//			left = keys[KeyEvent.VK_LEFT];
//			break;
//		case RIGHT:
//			right = keys[KeyEvent.VK_RIGHT];
//			break;			
//		}
//	}


	public void setKeys() {
		up = keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
	}

	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	
	}

	public EnumDirection getArrowKeys(){
		return arrowKeys;
	}
	
	

}
