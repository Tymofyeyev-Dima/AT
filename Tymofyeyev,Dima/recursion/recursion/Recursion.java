package recursion;

public class Recursion {

	public static void main(String[] args) {
		
		box();

	}
	
	public static int factorial(int x){
		if (x == 1)
			return 1;
		
		return x * factorial(x-1);
	}
	
	public static int fibonacci(int x){
		if (x == 1 || x == 2)
			return 1;
		return fibonacci(x-1) + fibonacci (x-2);
	}
	
	public static String reversal(String str){
		if (str.length() == 1)
			return str;
		return str.substring(str.length()-1)+ reversal(str.substring(0, str.length()-1));
	}
	
	public static void box(){
		
		String[][] a = new String[5][7];
		fillArray(a);
		for (String[] r : a){
			for (String c : r)
				System.out.print(c);
			System.out.println();
		}
		
		
	}
	
	public static void fillArray(String[][] a){
		fillArray(a, 0 , 0);
	}
	
	private static void fillArray(String[][] a, int row, int col){
		if (row < a.length){
			if (col < a[0].length){
				a[row][col] = "*";
				fillArray(a, row, col + 1);
			}
			else {
				fillArray( a, row +1, 0);
			}
		}
	}
	
	

}
