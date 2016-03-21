package clubs;

import java.io.File;
import java.io.FileNotFoundException;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		ClubMap test = new ClubMap(new File("H:\\workspace\\src\\hashTables\\clubs\\students"));
		test.printAllClubs();
		System.out.println("\n\nMath: "+test.getClubRoster("Math"));

	}

}
