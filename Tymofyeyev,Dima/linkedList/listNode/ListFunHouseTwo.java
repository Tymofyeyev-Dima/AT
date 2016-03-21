package listNode;


import static java.lang.System.*;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{

	}
	
	public void add(Comparable data)
	{
		if(theList!=null){
			ListNode list = theList;
			while(list!=null && list.getNext()!=null){
				list = list.getNext();
			}
			list.setNext(new ListNode(data,null,null));
		}
		
		else
			theList = new ListNode(data,null,null);
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
		int count=0;
		ListNode list= theList;
		
		while(list!=null){
			count++;
			list=list.getNext();
		}

		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode list = theList;
		ListNode first=list;
		ListNode head = new ListNode(first.getValue(),first.getNext(),first.getPrev());
		first.setNext(head);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode list = theList;

		while(list.getNext()!=null)
			list=list.getNext();
			
		list.setNext(new ListNode(list.getValue(),list.getNext(),list.getPrev()));
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
		ListNode list = theList;
		while(list!=null){
			ListNode next = list.getNext();
			if(next!=null){
				ListNode next2 = next.getNext();
				list.setNext(next2);
			}
			list=list.getNext();
		}


	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		int count = 1;
		ListNode list = theList;
		
		while(list!=null){
			if (count%x==0)
				list.setValue(value);
			list=list.getNext();
			count++;
			
		}

	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		ListNode list = theList;
		int count=0;
		
		while(list!=null){
			ListNode next = list.getNext();
			if(count%x==0){
				if(next!=null){
					ListNode next2 = next.getNext();
					list.setNext(next2);
				}
			}
			count++;
			list=list.getNext();
		}

	
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	String output="";
   	ListNode list = theList;
   	while(list!=null){
   		output+=list.getValue()+" ";
   		list=list.getNext();
   	}
   	
   	return output;
   }			
	
}