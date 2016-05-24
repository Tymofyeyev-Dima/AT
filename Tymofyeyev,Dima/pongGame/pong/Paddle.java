package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block {
	// instance variables
	private int speed;

	public Paddle() {
		super(10, 10);
		speed = 5;
	}
	
	public Paddle(int xPos, int yPos) {
		super(xPos, yPos, 10, 10);
		speed = 5;
	}
	
	public Paddle(int xPos, int yPos, int speed) {
		super(xPos, yPos, 10, 10);
		this.speed = speed;
	}
	
	public Paddle(int xPos, int yPos, int width, int height, int speed) {
		super(xPos, yPos, width, height);
		this.speed = speed;
	}
	
	public Paddle(int xPos, int yPos, int width, int height, Color color, int speed) {
		super(xPos, yPos, width, height, color);
		this.speed = speed;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}

	public void moveUpAndDraw(Graphics window) {

	}

	public void moveDownAndDraw(Graphics window) {

	}
	
	public String toString(){
		return super.toString() + " Speed: "+speed;
	}

}