package entity;

public class Entity {

	private int posX;
	private int posY;
	
	public Entity(){
		this(0, 0);
	}
	
	public Entity(int posX, int posY){
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