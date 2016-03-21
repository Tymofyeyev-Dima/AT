package dListNode;

import java.util.ArrayList;

public class DLinkedList {

	private DListNode firstNode;
	private DListNode lastNode;

	public DLinkedList() {
		firstNode = null;
		lastNode = null;
	}

	public boolean isEmpty() {
		return firstNode == null || lastNode == null;
	}

	public DListNode getFirst() {
		return firstNode;
	}

	public DListNode getLast() {
		return lastNode;
	}

	public void addFirst(Object o) {
		if (isEmpty()) {
			DListNode node = new DListNode(o, null, null);
			firstNode = node;
			lastNode = node;
		} else {
			DListNode newNode = new DListNode(o, firstNode, null);
			firstNode.setPrevious(newNode);
			firstNode = newNode;
		}

	}

	public void addLast(Object o) {
		if (isEmpty()) {
			DListNode node = new DListNode(o, null, null);
			firstNode = node;
			lastNode = node;
		} else {
			DListNode newNode = new DListNode(o, null, lastNode);
			lastNode.setNext(newNode);
			lastNode = newNode;
		}

	}

	public Object removeFirst() {
		DListNode temp = firstNode;
		firstNode = firstNode.getNext();
		return temp;
	}

	public Object removeLast() {
		DListNode temp = lastNode;
		lastNode = lastNode.getPrevious();
		return temp;
	}

	public int size() {
		int count = 0;
		DListNode temp = firstNode;

		while (temp != null) {
			count++;
			temp = temp.getNext();
		}

		return count;

	}

	public void clear() {
		firstNode = null;
		lastNode = null;
	}

	public String toString() {

		DListNode next = firstNode;
		String s = "";
		while (next != null) {
			s += next.getValue().toString() + " ";
			next = next.getNext();
		}

		return s;
	}

	public DListIterator iterator() {
		return new DListIterator(this);
	}

}
