package autoParts;

import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;

public class PartRunner
{
	public static void main(String[] args) throws FileNotFoundException
	{
		PartList prog = new PartList(new File("H:\\workspace\\src\\maps\\autoParts\\partinfo.dat"));
		System.out.println(prog);
	}
}
