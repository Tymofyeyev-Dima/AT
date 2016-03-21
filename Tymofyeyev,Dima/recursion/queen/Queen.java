package queen;

import knights.Knights2;

public class Queen {
	private int board[][];
	private int steps;
	private int size;
	
	public Queen(int size){
		board = new int[size][size];
		this.size=size;
	}
	
	public int getSteps(){
		return steps;
	}
	
	public int[][] getBoard(){
		return board;
	}
	
	public void displayBoard(){
		for(int[] row: board){
			for (int col: row)
				System.out.printf("%,3d", col);
			System.out.println("");
		}
		System.out.println("");
	}
	
	public void placeQueen(int r, int c){
		board[r][c] = 1;
	}
	
	public boolean move(int x, int y, int q){
		if(x<0 || y<0 || x >= size || y >= size)
			return false;
		
		if(board[x][y] > 0)
			return false;
		
		board[x][y] =1;
		if (q == 8)
			return true;
		return false;
	}
	
	private boolean isLegal(int row, int col){
		for (int i = 0; i < board[0].length; i ++)
			if (board[row][i] == 1)
				return false;
		for (int i = 0; i < board.length; i ++)
			if (board[i][col] == 1)
				return false;
		return true;
	}
	
	

}
