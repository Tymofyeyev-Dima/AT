package test;

public class Test {

	public static void main(String[] args) {
		int[][] a = new int[10][10];
		fillArray(a);
		
		for (int[] r : a){
			for (int c : r)
				System.out.print(c+" ");
			System.out.println();
		}
		
		System.out.println("Sum: "+ sum);

	}
	
	private static int sum = 0;
	
	public static void fillArray(int[][] a){
		fillArray(a, 0 , 0);
	}
	
	private static void fillArray(int[][] a, int row, int col){
		if (row < a.length){
			if (col < a[0].length){
				int num = getNum();
				sum += num;
				a[row][col] = num;
				
				fillArray(a, row, col + 1);
			}
			else {
				fillArray( a, row +1, 0);
			}
		}
	}
	
	private static int getNum(){
		return (int)( Math.random() *101);
	}
	
	

}
