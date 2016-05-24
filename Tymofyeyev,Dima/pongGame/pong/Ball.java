package pong;
import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball(){
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int xPos, int yPos){
		super(xPos, yPos);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int xPos, int yPos, int width, int height){
		super(xPos,yPos, width, height);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int xPos, int yPos, int width, int height, Color color){
		super(xPos,yPos, width, height, color);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int xPos, int yPos, int width, int height, Color color, int xSpeed, int ySpeed){
		super(xPos,yPos, width, height, color);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public void setXSpeed(int speed){
		xSpeed = speed;
	}
	
	public void setYSpeed(int speed){
		ySpeed = speed;
	}
	
	public int getXSpeed(){
		return xSpeed;
	}
	
	public int getYSpeed(){
		return ySpeed;
	}

	public void moveAndDraw(Graphics window) {
		// draw a white ball at old ball location

		setX(getX() + xSpeed);
		// setY

		// draw the ball at its new location
	}

	public boolean equals(Object obj) {
		if(super.equals(obj))
			if(xSpeed == ((Ball) obj).getXSpeed() && ySpeed == ((Ball) obj).getYSpeed())
				return true;
			else
				return false;
		else
			return false;
	}

	public String toString(){
		return super.toString() + " xSpeed: "+xSpeed+", ySpeed: "+ySpeed;
	}
}