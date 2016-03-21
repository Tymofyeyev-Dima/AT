package maze;

public class Maze {
	private int xPos, yPos;
	char[][] maze;
	
	public Maze (char[][] m , int xStart, int yStart){
		maze = m;
		xPos = xStart;
		yPos = yStart;
		
	}
	
	public void display(){
		for (char[] m : maze){
			for (char c : m)
				System.out.print(c);
			System.out.println();
		}
	}
	
	public boolean findExit(){
		if (maze[xPos][yPos] == ' '){
			if (xPos == 0 || xPos == maze.length - 1)
				return true;
			else if (yPos == 0 || yPos == maze[0].length - 1)
				return true;
		}
		
		return false;
			
	}
	
	public int getIExit(){
		return xPos;
	}
	
	public int getJExit(){
		return yPos;
	}
	
//	//up, right, down, left
//	public String getSteps(){
//		
//	}
}
