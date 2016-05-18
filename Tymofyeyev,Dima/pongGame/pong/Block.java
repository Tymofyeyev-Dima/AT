package pong;
import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable{
	private int xPos, yPos, width, height;
	private Color color;
	
	public Block(){
		xPos = 0; 
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.BLACK;
	}

	public Block (int xPos, int yPos, int width, int height){
		this.xPos = xPos; 
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.color = Color.BLACK;
	}
	
	public Block(int xPos, int yPos, int width, int height, Color color){
		this.xPos = xPos; 
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	

   public void setWidth(int w){
	   width = w;
   }
   
   public void setHeight(int h){
	   height = h;
   }
   
   public void setX(int x){
	   xPos = x;
   }
   
   public void setY(int y){
	   yPos = y;
   }
   
   public void setPos(int x, int y){
	   xPos = x;
	   yPos = y;
   }

   public void setColor(Color col){
	   color = col;
   }

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}
	
	public int getX(){
		return xPos;
	}
	
	public int getY(){
		return yPos;
	}
	
	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(xPos, yPos, width, height);
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(xPos, yPos, width, height);
	}

	public boolean equals(Object obj) {
		if (xPos == ((Block) obj).getX() && yPos == ((Block) obj).getY() && 
				height == ((Block) obj).getHeight() && width == ((Block) obj).getWidth())
			return true;
		else
			return false;
	}   	

	
	public String toString(){
		return "("+xPos+", "+yPos+")  w: "+width+"  h: "+height+"  c: "+color;
	}
}



