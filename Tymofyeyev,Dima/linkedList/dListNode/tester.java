package dListNode;

public class tester {

	public static void main(String[] args) {
		DLinkedList list = new DLinkedList();
		
		System.out.println(list.isEmpty());
		
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(1);
		list.addLast(10);
		list.addLast(21);
		list.addLast(31);
		list.addLast(12);
		
		System.out.println(list);
	System.out.println(list.isEmpty());
//		
		list.removeFirst();
		list.removeFirst();
		list.removeLast();
//		
		System.out.println(list);
		System.out.println(list.size());
//		
//		list.clear();
//		System.out.println(list+ "  (Clear)");
		
		DListIterator ite = list.iterator();
		//System.out.println(ite.hasNext());
		//System.out.println(ite.hasPrevious());
		ite.next();
		ite.next();
		//System.out.println(ite.hasNext());
		//System.out.println(ite.hasPrevious());
		System.out.println(ite.next()+"*");
		ite.add(9999);
		ite.set(65);
		System.out.println(ite);
		ite.remove();
		System.out.println(ite);
		
		while(ite.hasNext()){
			ite.next();
		}
		System.out.println(ite.hasNext());
		System.out.println(ite.hasPrevious());

		
		
		
		
		

	}

}
