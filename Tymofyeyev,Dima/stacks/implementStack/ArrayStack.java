package implementStack;

public class ArrayStack implements MyStack{
	
	private Object[] arr;
	public ArrayStack(){
		arr = new Object[]{};
	}

	@Override
	public Object push(Object item) {
		arr=arrCopy();
		arr[arr.length-1]=item;
		return item;
	}

	@Override
	public Object pop() {
		if(arr.length==0)
			return null;
		Object out = arr[arr.length-1];
		arr = arrDec();
		return out;
	}

	@Override
	public Object peek() {
		if(arr.length==0)
			return null;
		return arr[arr.length-1];
	}

	@Override
	public boolean isEmpty() {
		return arr.length == 0;	
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int search(Object a) {
		int counter = arr.length;
		for(int i = 0; i < arr.length; i ++){
			if (arr[i].equals(a))
				break;
			counter--;
		}
		if(counter==0)
			return -1;
		return counter;
		
	}
	
	private Object[] arrCopy(){
		Object[] temp = new Object[arr.length+1];
		if (arr.length!=0)
			for(int i = 0; i < arr.length; i++)
				temp[i]=arr[i];	
		return temp;
	}
	
	private Object[] arrDec(){
		Object[] temp = new Object[arr.length-1];
		if (arr.length!=0)
			for(int i = 0; i < temp.length; i++)
				temp[i]=arr[i];
		return temp;
	}
	
	public String toString(){
		String out = "";
		for(int i = arr.length-1; i >= 0; i--)
			out+=arr[i]+", ";
		return out;
	}

}
