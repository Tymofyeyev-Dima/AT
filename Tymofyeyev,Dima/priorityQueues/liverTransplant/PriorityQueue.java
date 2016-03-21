package liverTransplant;

import java.util.ArrayList;

public class PriorityQueue {
	private ArrayList<Comparable> pq;
	
	public PriorityQueue(){
		pq = new ArrayList<Comparable>();
	}
	
	public boolean isEmpty(){
		return pq.size() == 0;
	}
	
	public void add(Object x){
		pq.add((Comparable) x);
	}
	
	public Object peek(){
		Comparable min = pq.get(0);
		for(int i = 0; i < pq.size(); i ++)
			if(pq.get(i).compareTo(min)<0)
				min = pq.get(i);
		
		return min;		
	}
	
	public Object poll(){
		Comparable out = (Comparable) peek();
		for (int i =0; i < pq.size(); i ++)
			if(pq.get(i).equals(out))
				pq.remove(i);
		
		return out;
	}
	
	public int size(){
		return pq.size();
	}
	
	public String toString(){
		Comparable min = (Comparable) peek();
		String out = min+", ";
		for (int i =0; i < pq.size(); i ++)
			if(!pq.equals(min))
				out += pq.get(i)+" ";
		
		return out;
	}
}
