import src.String;

public class Position {
private double x;
private double y;
private double maxX;
private double maxY;

public Position(double x, double y, double maxX, double maxY) {
	this.x = x;
	this.y = y;
	this.maxX = maxX;
	this.maxY = maxY;
}

public Position(Position position) {
	return position; 
}

public double getX(){
    return x;
}

public void setX(double nx){
    x = nx;
}

public double getY() {
	return y;
}
public void setY(double ny) {
	y = ny;
}
protected void setMaxX(double nmaxX) {
	maxX = nmaxX;
}

protected void setMaxY(double nmaxY) {
	maxY = nmaxY;
}

}
