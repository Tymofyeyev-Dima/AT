package intro;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\git\\AT\\Tymofyeyev,Dima\\graphs\\intro\\graph1.dat"));
		int howManyTimes = Integer.parseInt(file.nextLine());
		for(int x=0; x<howManyTimes; x++){
			Graph g = new Graph(file.nextLine());
			String check = file.nextLine();
s			g.check(check.substring(0,1), check.substring(1), check.substring(0,1));
			System.out.println(check.substring(0,1)+" connects to " + check.substring(1) +" "+g.yahOrNay);
		}
		file.close();
	}
}