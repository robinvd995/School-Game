package entity;

import game.EnumKeyType;
import tiles.Tile;
import world.Room;

public class Player extends Entity{

	private EnumKeyType currentKey = EnumKeyType.NONE;
	
	public Player(Room room) {
		super(room);
	}
	
	public EnumKeyType getCurrentKey(){
		return currentKey;
	}
	
	public void moveTo(int dx, int dy){
		
		if(dx != 1 || dx != -1 || dy != 1 || dy != -1){
			return;
		}
		
		int nx = posX + dx;
		int ny = posY + dy;
		
		Tile tile = theRoom.getTile(posX + dx, posY + dy);
		tile.onPlayerWalkTo(this, theRoom, nx, ny);
		
		if(tile.canPlayerWalkTo(this)){
			posX = nx;
			posY = ny;
		}
	}
}
