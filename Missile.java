
public class Missile {
	private int SPEED = 4 ;
	private int WIDTH = 30;
	private int HEIGHT = 10;
	private int MAX_DISTANCE_TRAVELED = 1400;
	private String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile (Direction direction, Dimension dimension) {
	
	}
	
	public int getWidthWithADirection(Direction direction) {
		return direction;
	}
	
	public int getHeightWithADirection(Direction direction) {
		return direction;
	}
	public void move() {
		
	}
	public boolean isWeapon() {
		return true;
	}
}
