package javaLinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		ListIterator iter = list.listIterator();
		
		while(iter.hasNext())
			total+=(Integer)iter.next();
		return total;
	}

	public double getAvg(  )
	{
		double sum = 0;
		int count = 0;
		ListIterator iter = list.listIterator();
		
		while(iter.hasNext()){
			count++;
			sum+=(Integer)iter.next();
		}
		
		return sum/count;
	}

	public int getLargest()
	{
		ListIterator iter = list.listIterator();
		int largest=list.getFirst();
		
		while(iter.hasNext()){
			Integer num = (Integer) iter.next();
			if (num>largest){
				largest=num;
			}
		}
		
		return largest;
	}

	public int getSmallest()
	{
		ListIterator iter = list.listIterator();
		int smallest=list.getFirst();
		
		while(iter.hasNext()){
			Integer num = (Integer) iter.next();
			if (num<smallest){
				smallest=num;
			}
		}
		
		return smallest;
	}

	public String toString()
	{
		String output="SUM: "+getSum()+"\nAVERAGE: "+getAvg()+"\nSMALLEST: "+getSmallest()+"\nLARGEST: "+getLargest()+"\n";
		return output;
	}
}