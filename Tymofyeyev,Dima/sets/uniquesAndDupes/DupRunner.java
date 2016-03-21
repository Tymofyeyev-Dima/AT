package uniquesAndDupes;

import java.util.*;

public class DupRunner
{
	public static void main( String args[] ){
		String test = "a b c d e f g h a b c d e f g h i j k";
		String test2 = "one two three one two three six seven one two";
		String test3 = "1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 6";
		
		print(test);
		print(test2);
		print(test3);	
	}
	
	public static void print(String input){
		System.out.println("Original List: "+ input);
		System.out.println("Uniques: "+ getUniques(input));
		System.out.println("Dupes: "+ getDupes(input));
		System.out.println(" ");
	}
	
	public static Set<String> getUniques(String input){	
		return new TreeSet<String>(Arrays.asList(input.split(" ")));
	}
	
	public static Set<String> getDupes(String input){
		Set<String> dupes = new TreeSet<String>(), uniques = new TreeSet<String>();
		for(String w: input.split(" ")){
			if(!uniques.add(w))
				dupes.add(w);
		}
		return dupes;
	}
}