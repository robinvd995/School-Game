package entity;

import game.EnumDirection;
import game.EnumKeyType;
import game.KeyGame;
import input.Movement;
import tiles.Tile;
import world.Room;

public class Player extends Entity{

	private EnumKeyType currentKey = EnumKeyType.NONE;
	private Movement movement;
	private float xMove, yMove;
	
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
	
	public void move(){
		xMove = 0;
		yMove = 0;
		
		if (KeyGame.getMovement().up){
			//yMove -- go up
		}
			
		if (KeyGame.getMovement().down){
			//yMove ++ go down
		}
			
		if (KeyGame.getMovement().left){
			//xMove -- go left
		}
		
		if (KeyGame.getMovement().right){
			//xMove ++ go right
		}	
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
//}
