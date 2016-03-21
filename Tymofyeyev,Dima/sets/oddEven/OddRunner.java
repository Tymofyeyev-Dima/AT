package oddEven;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OddRunner
{
	public static void main( String args[] ) throws IOException{	
		 try {
	            Scanner input = new Scanner(new File("H:\\workspace\\src\\sets\\oddevendata.dat"));

	            while (input.hasNextLine()) {
	                System.out.println(new OddEvenSets(input.nextLine()));
	            }
	            input.close();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
		
				
	}
}