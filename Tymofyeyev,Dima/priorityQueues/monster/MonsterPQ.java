package monster;

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class MonsterPQ  
{
	private Queue<Monster> pQueue;

	public MonsterPQ(){
		pQueue = new LinkedList<Monster>();
	}

	public void add(Monster obj){
		pQueue.add(obj);
	}
	
	public Object getMin(){
		Queue<Monster> temp = new LinkedList<Monster>();
		Monster min = pQueue.peek();
		while(!pQueue.isEmpty()){
			Monster a = pQueue.remove();
			temp.add(a);
			if (a.getAge()<min.getAge())
				min = a;
			else if (a.getAge()==min.getAge()){
				if(a.getHeight()<min.getHeight())
					min = a;
				else if(a.getHeight()==min.getHeight())
					if(a.getWeight()<min.getWeight())
						min = a;
			}
		}
		pQueue=temp;
		return min;
	}
	
	public Object removeMin(){
		Monster out = (Monster) getMin();
		Queue<Monster> temp = new LinkedList<Monster>();
		while(!pQueue.isEmpty()){
			Monster a = pQueue.remove();
			if(!a.equals(out))
				temp.add(a);
		}
		pQueue = temp;	
		return out;
	}
	
	public String getNaturalOrder(){
		String output="";
		while(!pQueue.isEmpty())
		{
			output+=pQueue.remove()+ " ";
		}
		return output;		
	}

	public String toString(){
		return ""+pQueue;
	}
}