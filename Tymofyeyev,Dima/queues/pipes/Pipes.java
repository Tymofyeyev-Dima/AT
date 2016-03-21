package pipes;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pipes extends JFrame{
	private Queue<Line2D> queue; 
	
	public Pipes(){
		super("PIPES");
		setSize(500, 500);
		setVisible(true);
		queue = new LinkedList<Line2D>();
		this.setBackground(Color.BLACK);
	}
	
	public void store(Line2D in){
		queue.add(in);
	}
	
	public void paint(Graphics g){
		super.paint (g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.WHITE);
		Double nextX = 0.0;
		Double nextY = 0.0;
		for(int i = 0; i < 17; i ++){
			if(!queue.isEmpty()){
				Line2D nLine = new Line2D.Double();
				Double nX = (Math.random()*500);
				Double nY = (Math.random()*500);
				nLine.setLine(nextX, nextY, nX, nY);
				nextX=nX;
				nextY=nY;
				store(nLine);
				g2.draw(nLine);
				try {

				     Thread.currentThread().sleep(500);

				} catch (InterruptedException e){ 

				    e.printStackTrace();

				}

			}
			else{
				Line2D nLine = new Line2D.Double();
				nextX = (Math.random()*500);
				nextY = (Math.random()*500);
				nLine.setLine((Math.random()*500), (Math.random()*500), nextX, nextY);
				store(nLine);
				g2.draw(nLine);
				try {

				     Thread.currentThread().sleep(500);

				} catch (InterruptedException e){ 

				    e.printStackTrace();

				}

			}
		}
		
		
		while(!queue.isEmpty()){
			g2.setColor(Color.GREEN);
			Line2D cLine = new Line2D.Double();
			Line2D org = queue.poll();
			cLine.setLine(org.getX1(), org.getY1(), org.getX2(), org.getY2());
			g2.draw(cLine);
		}
	}
	
	
	public static void main(String[] args){
		Pipes test = new Pipes();
		test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
