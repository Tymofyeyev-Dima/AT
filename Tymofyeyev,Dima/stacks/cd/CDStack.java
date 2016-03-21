package cd;
import java.util.Stack;
import java.util.Iterator;

public class CDStack {
	Stack<String> myStack;
	
	public CDStack(){
		myStack= new Stack<String>();
		insert("Journey");
		insert("Iggy Pop");
		insert("Hall & Oats");
		insert("Genesis");
		insert("Foreigner");
		insert("Eagled");
		insert("Deep Purple");
		insert("Cheap Trick");
		insert("Beatles");
		insert("Aerosmith");
	}
	
	public CDStack(String[] cds){
		myStack=new Stack<String>();
		for(int i = 0; i <cds.length; i ++){
			insert(cds[i]);
		}	
	}
	
	public void insert(String name){
		myStack.push(name);
	}
	
	public String nextCD(){
		return myStack.peek();
	}
	
	public String playNextCD(){
		return myStack.pop();
	}
	
	public int find(String name){
		return myStack.search(name);
	}
	
	public Stack<String> getStack(){
		return myStack;
	}
	
	public void printCDs(){
		String out = "";
		while(!myStack.empty())
			out+=myStack.pop()+ ", ";
		System.out.println(out);
	}
	
	public void printCDs2(){
		String out = "";
		Iterator<String> ite = myStack.iterator();		
		while(ite.hasNext())
			out+=ite.next()+" ";
		System.out.println(out);
	}
	
	public void printCDs3(){
		String out = "";
		for(String x: myStack)		
			out+=x+" ";
		System.out.println(out);
	}
	
	public String printCds4(){
		if(myStack.empty())
			return "";
		else
			return myStack.pop()+", "+printCds4();
	}
	
	public void reverse(){
		Stack<String> temp = new Stack<String>();
		while(!myStack.empty())
			temp.push(myStack.pop());
		myStack = temp;
	}
	
	private static String path(){
		while(1!=0)
			System.out.println("Chesse ");
	}
	
	public void combine(CDStack other){
		other.reverse();
		
		while(!other.getStack().empty())
			myStack.push(other.getStack().pop());			
	}
	
	public static void convertToBinary(int x){
		Stack<String> temp = new Stack<String>();
		while(x>0){
			int num = x%2;
			temp.push(num+"");
			x/=2;
		}
		
		Stack<String> temp2 = new Stack<String>();
		while(!temp.empty())
			temp2.push(temp.pop());
		temp = temp2;
		
		String out = "";
		Iterator<String> ite = temp.iterator();		
		while(ite.hasNext())
			out+=ite.next()+"";
		System.out.println(out);	
	}
	
	public static void main(String[] args){
//		CDStack tc = new CDStack();
//		String[] cds = new String[]{ "Cookies" , "Pizza", "Buns"};
//		CDStack tc2 = new CDStack(cds);
//		tc.combine(tc2);
//		System.out.println(tc.printCds4());
		convertToBinary(34);
		path();
		
		
		
		
		
	}

}
