package phone;

import java.io.File;
import java.io.FileNotFoundException;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException {
		PhoneBook test = new PhoneBook(10);
		test.load(new File("H:\\workspace\\src\\hashTables\\phone\\phones"));
		//test.load(new File("H:\\workspace\\src\\hashTables\\phone\\phonesTest"));
		test.display();
		System.out.println("\nSize "+test.getSize());
		System.out.println("Capacity "+test.getCapacity());
		System.out.println("Number of Null"+test.getNumberOfNulls());
		System.out.println("Lookup Vinson "+test.lookup("Vinson"));
		test.changeNumber("Vinson", "9999999");
		System.out.println("Change Vinson "+test.lookup("Vinson"));

	}

}
