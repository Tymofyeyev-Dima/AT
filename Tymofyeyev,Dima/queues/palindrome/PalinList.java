package palindrome;

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
	private ArrayList<String> phrase;

	public PalinList(){
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		phrase = new ArrayList<String>();
		setList("");
	}

	public PalinList(String list){
		stack = new Stack<String>();
		queue = new LinkedList<String>();
		phrase = new ArrayList<String>();
		setList(list);
	}

	public void setList(String list){
		String[] temp = list.split(" ");
		for (int i = 0; i < temp.length; i ++){
			stack.add(temp[i]);
			queue.add(temp[i]);
			phrase.add(temp[i]);
		}
	}

	public boolean isPalin()
	{
		while(!stack.isEmpty()){
			if(stack.pop().compareTo(queue.poll()) != 0)
				return false;
		}
		return true;
	}

	public String toString(){
		String out = "";
		for (int i = 0; i < phrase.size(); i ++)
			out += phrase.get(i)+ " ";
		return out;
	}
}