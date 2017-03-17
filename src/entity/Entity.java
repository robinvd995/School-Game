package entity;

import world.Room;

public class Entity {

	protected Room theRoom;
	
	protected int posX;
	protected int posY;
	
	public Entity(Room room){
		this(room, 0, 0);
	}
	
	public Entity(Room room, int posX, int posY){
		this.theRoom = room;
		this.posX = posX;
		this.posY = posY;
	}
	
	public void setPosX(int newX){
		this.posX = newX;
	}
	
	public void setPosY(int newY){
		this.posY = newY;
	}
	
	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
}