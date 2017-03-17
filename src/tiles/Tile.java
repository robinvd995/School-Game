package tiles;

import entity.Player;
import game.EnumKeyType;
import world.Room;

public class Tile {

	public static final Tile TILE_NONE = new Tile();
	public static final Tile TILE_WALL = new Tile().setSolid();
	public static final Tile TILE_BARRICADE_RED = new TileBarricade(EnumKeyType.RED);
	
	private boolean solid = false;
	
	public Tile(){
		
	}
	
	public Tile setSolid(){
		solid = true;
		return this;
	}
	
	public boolean canPlayerWalkTo(Player player){
		return !solid;
	}
	
	public void onPlayerWalkTo(Player player, Room room, int x, int y){}
}
