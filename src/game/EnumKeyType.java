package game;

public enum EnumKeyType {
	
	NONE(0, 0, 0, 0), 
	RED(1, 1, 0, 0), 
	GREEN(2, 0, 1, 0), 
	BLUE(3, 0 ,0 , 1);
	
	public final int id;
	public final float r, g, b;
	
	private EnumKeyType(int id, float r, float g, float b){
		this.id = id;
		this.r = r;
		this.g = g;
		this.b = b;
	}
}
