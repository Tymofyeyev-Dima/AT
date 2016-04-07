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
		
		while(root < top){
			int left = root *2+1;
			int right = root*2+2;
			int max = root;
			
			if(left < list.size())
				if(list.get(left) > list.get(max))
					max = left;
			
			if (right < list.size())
				if(list.get(right) > list.get(max))
					max = right;
			
			if( max > root){
				swap(root, max);
				root = max;
			}
			else
				break;
		}
	}
	
	private void swap(int start, int finish){	
		int temp = list.get(start);
		list.set(start, list.get(finish));
		list.set(finish, temp);
	}

	public void print(){
		out.println("\n\nPRINTING THE HEAP!\n\n");
		for(int level = 0; level<Math.sqrt(list.size())+1; level++){
			for (int i = 0; i < list.size(); i++)
				System.out.print(list.get(i)+ " ");
		}
		
		
		
	}

	public String toString(){
		String out = "";
		for (int i  = 0; i < list.size(); i ++)	
			out += list.get(i) + " ";
		return out;
	}
}