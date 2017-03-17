package tiles;

import entity.Player;
import game.EnumKeyType;
import world.Room;

public class TileBarricade extends Tile{

	private EnumKeyType correctKeyType;
	
	public TileBarricade(EnumKeyType key){
		this.setSolid();
		this.correctKeyType = key;
	}
	
	@Override
	public void onPlayerWalkTo(Player player, Room room, int x, int y){
		if(player.getCurrentKey() == correctKeyType){
			room.setTile(Tile.TILE_NONE, x, y);
		}
	}
}
