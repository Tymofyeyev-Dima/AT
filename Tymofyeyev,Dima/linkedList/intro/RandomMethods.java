package intro;

import java.util.LinkedList;
import java.util.ListIterator;

public class RandomMethods {

	public static void main(String[] args) {
		LinkedList<String> staff = new LinkedList<String>();
		staff.add("Tom");
		staff.add("Jack");
		staff.add("Harry");
		staff.add("Maine");
		
		
		delete(staff,"Tom");
//		staff = insert(staff, "Tom", "Robyn");
//		ListIterator iterator = staff.listIterator();
//		while (iterator.hasNext()){
//			System.out.print(iterator.next()+" ");
//		}

	}
	
	public static void reverse(LinkedList<String> staff){
		LinkedList<String> temp = new LinkedList<String>();
		ListIterator iterator = staff.listIterator();
		
		while (iterator.hasNext()){
			temp.addFirst((String) iterator.next());
		}
		
		iterator = temp.listIterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		
	}
	
	public static void duplicate(LinkedList<String> staff){
		LinkedList<String> temp = new LinkedList<String>();
		ListIterator iterator = staff.listIterator();
		
		while (iterator.hasNext()){
			String toAdd = (String) iterator.next();
			temp.add(toAdd);
			temp.add(toAdd);
		}
		
		iterator = temp.listIterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
	}
	
	public static void repeat(LinkedList staff){
		ListIterator iterator = staff.listIterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
		
		iterator = staff.listIterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
	}
	
	public static void delete(LinkedList staff, String searchFor){
		ListIterator iterator = staff.listIterator();
		while (iterator.hasNext()){
			if ((((String) iterator.next()).compareToIgnoreCase(searchFor) == 0))
				iterator.remove();
		}
		
		iterator = staff.listIterator();
		while (iterator.hasNext()){
			System.out.print(iterator.next()+" ");
		}
	}
	
	public static LinkedList<String> insert(LinkedList staff, String wordAfter, String toAdd){
		LinkedList<String> temp = new LinkedList<String>();
		ListIterator iterator = staff.listIterator();
		
		while (iterator.hasNext()){
			String word = (String) iterator.next();
			if (word.compareToIgnoreCase(wordAfter)!=0)
				temp.add(word);
			else{
				temp.add(word);
				temp.add(toAdd);
			}
			
		}
		
		return temp;
	}
	

}








