package relatives;


import java.io.File;
import java.io.IOException;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		Relatives test = new Relatives(new File("H:\\workspace\\src\\maps\\relatives\\relatives.dat"));
		System.out.println(test);
		
	}
}