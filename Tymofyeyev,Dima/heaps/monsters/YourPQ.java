package monsters;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class YourPQ{
	private Queue pQueue;

	public YourPQ(){
		pQueue = new PriorityQueue();
	}

	public void add(Object obj){
		pQueue.add(obj);

	}
	
	public Object getMin(){
		return pQueue.peek();
	}
	
	public Object removeMin(){
		return pQueue.poll();
	}
	
	public String getNaturalOrder(){
		String output="";
		while(!pQueue.isEmpty())
			output+=pQueue.remove()+" ";
		return output;		
	}

	public String toString(){
		return "" + pQueue;
	}
	
	
}