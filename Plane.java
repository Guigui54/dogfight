
public class Plane extends Mobile{

	private int SPEED = 2 ;
	private int WIDTH = 100;
	private int HEIGHT = 30;
	private int player;
	
	public Plane(int player, Direction direction, Position position,String image) {
		
	}
	
	public boolean isPlayer(int player) {
		return 1;
	}
	
	public boolen hit() {
		return true;
	}
}
