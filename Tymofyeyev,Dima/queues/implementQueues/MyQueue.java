package implementQueues;

import java.util.ArrayList;

public class MyQueue {
	
	private ArrayList<Object> arr;
	
	public MyQueue(){
		arr = new ArrayList<Object>();
	}
	public Object offer(Object item){
		arr.add(item);
		return item;
	}
	
	public Object poll(){
		Object out = arr.get(0);
		arr.remove(0);
		return out;
	}
	
	public Object peek(){
		return arr.get(0);
	}
	
	public boolean isEmpty(){
		return arr.size() == 0;
	}
	
	public int size(){
		return arr.size();
	}
	
	public int search(Object a){
		int count = 1;
		for (int i = 0; i < arr.size(); i ++){
			if (arr.get(i).equals(a))
				return count;
			count++;
		}
		
		return -1;
	}
	
	public String toString(){
		String out = "";
		for (int i = 0; i < arr.size(); i ++){
			out+=arr.get(i)+", ";
		}
		return out;
	}

}
