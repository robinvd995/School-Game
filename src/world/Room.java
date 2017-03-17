package world;

import tiles.Tile;

public class Room {

	private Tile[][] tiles;
	
	public Room(int width, int height){
		tiles = new Tile[width][height];
	}
	
	public Tile getTile(int x, int y){
		if(isTileWithinRange(x, y)){
			return tiles[x][y];
		}
		else{
			return null;
		}
	}
	
	public void setTile(Tile tile, int x, int y){
		if(isTileWithinRange(x, y)){
			tiles[x][y] = tile;
		}
	}
	
	public boolean isTileWithinRange(int x, int y){
		return x >= 0 && x < tiles.length && y >= 0 && y < tiles[0].length;
	}
}
