package shortestPath;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShortestPathGraphRunner{
	public static void main( String[] args ) throws IOException{
		Scanner file = new Scanner(new File("H:\\git\\AT\\Tymofyeyev,Dima\\graphs\\shortestPath\\test_data"));
		int howManyTimes = Integer.parseInt(file.nextLine());
		for(int x=0; x<howManyTimes; x++){
			ShortestPathGraph g = new ShortestPathGraph(file.nextLine());
			String check = file.nextLine();
			g.check(check.substring(0,1), check.substring(1), check.substring(0,1), 1);
			if(g.yayOrNay)
				System.out.println(check.substring(0,1)+" connects to " + check.substring(1) +" | "+g.yayOrNay+" in "+g.shortest+" steps");
			else
				System.out.println(check.substring(0,1)+" connects to " + check.substring(1) +" | "+g.yayOrNay);
		}
		file.close();
	}
}