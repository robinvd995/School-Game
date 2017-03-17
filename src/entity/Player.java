package entity;

import game.EnumDirection;
import game.EnumKeyType;
import input.Movement;
import tiles.Tile;
import world.Room;

public class Player extends Entity{

	private EnumKeyType currentKey = EnumKeyType.NONE;
	private Movement movement;
	
	public Player(Room room) {
		super(room);
	}
	
	public EnumKeyType getCurrentKey(){
		return currentKey;
	}
	
	public void moveTo(EnumDirection dir){
		
		if(dir == null)
			return;
		
		int nx = posX + dir.x;
		int ny = posY + dir.y;
		
		Tile tile = theRoom.getTile(posX + dir.x, posY + dir.y);
		tile.onPlayerWalkTo(this, theRoom, nx, ny);
		
		if(tile.canPlayerWalkTo(this)){
			posX = nx;
			posY = ny;
		}
	}
	
//	public void move(){
//		if (movement.getArrowKeys().up){
//			
//		}
//		if (movement.getArrowKeys().down){
//			
//		}
//		if (movement.getArrowKeys().left){
//	
//		}
//		if (movement.getArrowKeys().right){
//	
//		}		
//	}
}
