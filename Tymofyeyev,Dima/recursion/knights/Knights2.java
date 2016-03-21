package knights;

public class Knights2 {
	private long steps;
	private int[][] board;
	int size;
	
	public Knights2(int size){
		board = new int[size][size];
		steps = 0;
		this.size = size;
	}
	
	public long getSteps(){
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
	
	private boolean move(int startX, int startY){
		return move(startX, startY, 1);
	}
	
	private boolean move(int i, int j, int moveNum){
		steps++;
		//displayBoard();
		
		//outside of grid
		if(i<0 || j<0 || i >= size || j >= size)
			return false;
		
		//not empty
		if(board[i][j] > 0)
			return false;
		
		board[i][j] = moveNum;
		if (moveNum == size * size)
			return true;
		
		int[] myHorizMove = { 0, 1, 1, -1, -1, 2, 2, -2, -2};
		int[] myVertMove = { 0, -2, 2, -2, 2, 1, -1, -1, 1 };
		
		for (int c = 1; c <= 8; c++){
			int nextI = i + myHorizMove[c];
			int nextJ = j + myVertMove[c];
			if (move(nextI,nextJ,moveNum + 1))
				return true;
		}
		
		board[i][j] = 0;
		return false;
	}
	
	public static void main(String[] args){
		Knights2 test = new Knights2(8);
		test.move(0, 0);
		test.displayBoard();
		System.out.printf("%,3d", test.getSteps());
	}
}

