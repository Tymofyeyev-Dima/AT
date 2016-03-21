package thingCount;

public class HistoList2 {
	private ListNode front;

	public HistoList2() {
	}

	// ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
	// IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
	public void add(Object obj) {
		if (front == null)
			front = new ListNode(new ThingCount(obj, 1), null);
		
		else if (front.getNext() == null) {
			ListNode list = front;
			ThingCount temp = (ThingCount) list.getValue();
			if (temp.getThing().equals(obj))
				temp.setCount(temp.getCount() + 1);
			else
				front = new ListNode(new ThingCount(obj, 1), list);
		} 
		
		else {
			boolean exist = false;
			ListNode list = front;
			ListNode first = list;
			ListNode back = new ListNode(first.getValue(),first.getNext());
			while (list!= null) {
				ThingCount temp = (ThingCount) list.getValue();
				if (temp.getThing().equals(obj)){
					exist = true;
					temp.setCount(temp.getCount() + 1);
				}
				list = list.getNext();
			}

			if (!exist) {
				front = new ListNode(new ThingCount(obj, 1), back);
			}

		}
	}

	// RETURNS THE INDEX POSITION OF LET IN THE LIST
	public int indexOf(Object obj) {
		int spot = 1;
		ListNode list = front;
		while (list!=null) {
			ThingCount temp = (ThingCount) list.getValue();
			if (temp.getThing().equals(obj))
				return spot;
			list=list.getNext();
			spot++;
		}
		return -1;
	}

	// RETURNS A REFERENCE TO THE NODE AT SPOT
	public ListNode nodeAt(int spot) {
		ListNode current = front;
		int counter = 1;
		while(current!=null){
			if(counter==spot)
				return current;
			current=current.getNext();
			counter++;
		}
		return null;
	}

	// RETURNS THE LIST AS A BIG STRING
	public String toString() {
		ListNode list = front;
		String output = "";

		while (list != null) {
			ThingCount thing = (ThingCount) list.getValue();
			output += thing.getThing() + "-"
					+ thing.getCount() + "\t";
			list = list.getNext();
		}

		return output;
	}
}