package circularArrayQueue;

public class CircularArrayQueue {
	
	private int tail, head, theSize;
	private Object[] elements;
	
	public CircularArrayQueue(int capacity){
		elements = new Object[capacity];
	}
	
	public void add(Object x){
		doubleIt();
		elements[tail] = x;
		theSize ++;
		tail ++;
		if (tail==elements.length)
			tail = 0;

	}
	
	private void doubleIt(){
		if (theSize == elements.length){
			Object[] temp = new Object[elements.length*2+1];
			int count = 0;
			
			for (int i = head; i < elements.length; i ++){
				temp[count] = elements[i];
				count++;
			}
			
			for (int i = 0; i < tail; i ++){
				temp[count] = elements[i];
				count++;
			}
			
			head = 0;
			tail=count;
			elements= temp;
		}
	}
	
	public Object remove(){
		Object temp = elements[head];
		elements[head] = null;
		head ++;
		theSize --;
		if (head == elements.length)
			head = 0;
		return temp;
	}
	
	public int size(){
		return theSize;
	}
	
	public String toString(){
		String out = "";
		for (int i = 0; i < elements.length; i ++)
			out += elements[i]+" ";
		return out;
	}

}
