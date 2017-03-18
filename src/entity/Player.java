package entity;

import game.EnumDirection;
import game.EnumKeyType;
import input.IActionListener;
import input.InputAction;
import tiles.Tile;
import world.Room;

public class Player extends Entity implements IActionListener{

	private EnumKeyType currentKey = EnumKeyType.NONE;
	//private Movement movement;
	//private float xMove, yMove;

	private PlayerMovement playerMovement;
	
	public Player(Room room) {
		super(room);
		playerMovement = new PlayerMovement(this);
	}

	public EnumKeyType getCurrentKey(){
		return currentKey;
	}

	@Override
	public void onAction(InputAction action, int actionFlag) {
		switch(action){
		default: return;

		case MOVE_UP:
			startMoving(EnumDirection.UP);
			break;

		case MOVE_DOWN:
			startMoving(EnumDirection.DOWN);
			break;
			
		case MOVE_LEFT:
			startMoving(EnumDirection.LEFT);
			break;

		case MOVE_RIGHT:
			startMoving(EnumDirection.RIGHT);
			break;
		}
	}
	/**
	 * Start moving the player in a direction, won't do anything if the player is already moving.
	 * @param dir the direction the player needs to move to.
	 */
	public void startMoving(EnumDirection dir){

		if(dir == null || playerMovement.isPlayerMoving())
			return;

		int nx = posX + dir.x;
		int ny = posY + dir.y;

		Tile tile = theRoom.getTile(nx, ny);
		tile.beforePlayerWalkTo(this, theRoom, nx, ny);

		if(tile.canPlayerWalkTo(this)){
			playerMovement.startMoving(dir);
		}
	}
	
	/**
	 * Fired by player movement when the player is ready to progress to the next tile.
	 * @param dir the direction the player needs to move to.
	 */
	public void finalizeMove(EnumDirection dir){
		if(dir == null)
			return;
		
		int nx = posX + dir.x;
		int ny = posY + dir.y;
		
		Tile tile = theRoom.getTile(nx, ny);
		tile.onPlayerWalkedTo(this, theRoom, nx, ny);
		
		posX = nx;
		posY = ny;
	}

	@Override
	public boolean isActive() {
		return true;
	}

	/*public void move(){
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
	}*/
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
