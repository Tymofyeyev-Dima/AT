package mathSet;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import oddEven.OddEvenSets;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException{
		try {
            Scanner input = new Scanner(new File("H:\\workspace\\src\\sets\\mathsetdata.dat"));

            while (input.hasNextLine()) {
            	MathSet test = new MathSet(input.nextLine(), input.nextLine());
            	System.out.println(test);
            	System.out.println(test.union());
            	System.out.println(test.intersection());
            	System.out.println(test.differenceAMinusB());
            	System.out.println(test.differenceBMinusA());
            	System.out.println(test.symmetricDifference());
            	System.out.println("-----------------------------------");
              
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
}
