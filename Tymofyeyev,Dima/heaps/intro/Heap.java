package intro;

import java.util.List;
import java.util.ArrayList;
import static java.lang.System.*;

public class Heap{
	private List<Integer> list;

	public Heap(){
		list = new ArrayList<Integer>();
	}

	public void add(int value){
		list.add(value);
		swapUp(list.size()-1);
	}

    public void swapUp(int bot){
    	while(bot > 0){
    		int parent = (bot-1)/2;
    		if (list.get(parent) < list.get(bot)){
    			swap(parent, bot);
    			bot = parent;
    		}
    		else
    			bot = 0;
    	}
    }

	public void remove( ){
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);
		swapDown(list.size());
	}

	public void swapDown(int top){
		int root = 0;
		int max = -1;
		while(root < top){
			int left = root *2;
			int right = root*2+1;
			
			if(list.get(left) != null){
				if (list.get(right) != null){
					if( list.get(left) > list.get(right))
						max = left;
					else 
						max = right;
				}
				else
					max = left;			
			}
			else
				root = top;
			
			if( list.get(max) > list.get(root)){
				swap(max, root);
				root = max;
			}
		}
	}
	
	private void swap(int start, int finish){	
		int temp = list.get(start);
		list.set(start, list.get(finish));
		list.set(finish, temp);
	}

	public void print(){
		out.println("\n\nPRINTING THE HEAP!\n\n");
		out.println();
		for (int i  = 0; i < list.size(); i ++)
			System.out.print(list.get(i)+ " ");
	}

	public String toString(){
		return list.toString();
	}
}