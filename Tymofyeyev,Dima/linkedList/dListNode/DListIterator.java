package dListNode;

public class DListIterator {

	private DListNode current;
	private DListNode previous;
	private DLinkedList myList;
	private boolean canRemove; // for remove() method. true if OK to call

	public DListIterator(DLinkedList list) {
		myList = list;
		current = list.getFirst();
		previous = null;
		canRemove = false;

	}

	public boolean hasPrevious() {
		return current != null && current.getPrevious() != null;
	}

	public boolean hasNext() {
		return current != null && current.getNext() != null;
	}

	public Object next() {
		previous = current;
		current = current.getNext();

		if (previous != null)
			canRemove = true;
		else
			canRemove = false;
		return previous.getValue();
	}

	public Object previous() {

		previous = current;
		current = current.getPrevious();
		if (previous != null)
			canRemove = true;
		else
			canRemove = false;
		return previous.getValue();
	}

	public void remove() {
		if (canRemove) {
			if (hasPrevious()) {
				current = previous.getNext();
				previous = previous.getPrevious();
				previous.setNext(current);
			} else
				previous = null;
		}
	}

	public void add(Object element) {
		previous.setNext(new DListNode(element, previous.getNext(), previous));
//		current = previous.getNext();

	}

	public void set(Object element) {
		previous.setValue(element);
	}

	public String toString() {
		return myList.toString();
	}
}