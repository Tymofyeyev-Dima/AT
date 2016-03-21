package phones;

import java.io.File;
import java.io.FileNotFoundException;

public class tester {

	public static void main(String[] args) throws FileNotFoundException {
		PhoneBook test = new PhoneBook(new File("H:\\workspace\\src\\binaryTrees\\phones\\phones"));
		test.display();
		System.out.println("Delete Wakeman\n");
		test.delete("Wakeman");
		test.display();
		System.out.println("Lookup Wakeman: "+test.lookupNumber("Wakeman"));
		System.out.println("Lookup Vance #: "+test.lookupNumber("Vance"));
		System.out.println("LookFor 9830320: "+test.reverseLookup("9830320"));
		

	}

}
