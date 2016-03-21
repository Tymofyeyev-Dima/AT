package histoNode;


import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

	public HistoList(char let )
	{
		front = new HistoNode(let,1,null);
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let){	
		if(front.getNext()!=null){
			HistoNode list = front;
			HistoNode first = list;
			HistoNode back=new HistoNode(first.getLetter(),first.getLetterCount(),first.getNext());
			boolean exist = false;
		
			while(list!=null){
				if(list.getLetter()==let){
					exist=true;
					list.setLetterCount(list.getLetterCount()+1);
				}
				list=list.getNext();
			}
			
			if(!exist){
				front = new HistoNode(let, 1, back);
			}
		}
		
		else{
			HistoNode list = front;
			if (list.getLetter()==let)
				list.setLetterCount(list.getLetterCount()+1);
			else
				front = new HistoNode(let,1,list);
			
		}

	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		int pos = 1;
		HistoNode list = front;
		
		while(list!=null){
			if(list.getLetter()==let)
				return pos;
			list=list.getNext();
			pos++;
			
		}
		return -1;
	}

	//returns a reference to the node at spot
	public HistoNode nodeAt(int spot)
	{
		int count = 1;
		
		HistoNode list = front;
		
		while(list!=null){
			if (count == spot)
				return list;
			list=list.getNext();
			count++;
		}
		return null;
	}

	//returns a string will all values from list
	public String toString()
	{
		HistoNode list = front;
		String output = "";
		
		while(list!=null){
			output+=list.getLetter()+"-"+list.getLetterCount()+"\t";
			list=list.getNext();
		}

		return output;
	}
}