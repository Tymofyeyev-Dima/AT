package fractals;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.JApplet;
import javax.swing.JFrame;

public class Fractal extends JApplet {

	public void paint(Graphics g){
		drawCircle(50, 50, 600, g, 255, 255, 255);
		drawRect(100, 50, 50, g, 0, 255, 248);
	}
	
	public static void main(String[] args) {       
		JFrame frame = new JFrame("Fractal");
		JApplet applet = new Fractal();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setSize(new Dimension(10000, 10000));
        frame.setVisible(true);        
	}
		
	private void drawCircle(int x, int y, int r, Graphics g, int red, int green, int blue){
		Graphics2D g2 = (Graphics2D)  g;
		g2.setPaint(new Color(red, green, blue));
		g2.draw(new Ellipse2D.Double(x, y, r, r));
		
		if (r>2){
			drawCircle(x+r/2, y, r/2, g, 255, 3, 3);
			drawCircle(x, y, r/2, g, 28, 3, 255);
			drawCircle(x, y+r/2, r/2, g, 20, 255, 3);
			//drawCircle(x+r/2, y+r/2, r/2, g, 0, 0, 0);
		}
	}
	
	private void drawRect(int side, int x, int y, Graphics g, int red, int green, int blue){
		Graphics2D g2 = (Graphics2D)  g;
		g2.setPaint(new Color(red, green, blue));
		g2.draw(new Rectangle2D.Double(x, y, side, side));
		
		if (side < 600){
			drawRect(side+20, x, y, g, red, green-5, blue-7);
			
		}
	}

}
