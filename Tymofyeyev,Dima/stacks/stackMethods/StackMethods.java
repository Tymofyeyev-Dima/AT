package stackMethods;

import java.util.Stack;

public class StackMethods {
	
	public static double getAverage(Stack<Integer> one){
		double sum = 0;
		int count = 0;
		
		while(!one.isEmpty()){
			sum+=one.pop();
			count++;
		}
		
		return sum/count;
	}
	
	public static Stack<String> alternateStack(Stack<String> one, Stack<String> two){
		Stack<String> temp = new Stack<String>();
		
		while(!one.isEmpty() || !two.isEmpty()){
			if(one.isEmpty() && !two.isEmpty())
				temp.push(two.pop());
			else if(two.isEmpty() && !one.isEmpty()) 
				temp.push(one.pop());
			else{
				temp.push(one.pop());
				temp.push(two.pop());
			}
		}
		
		return temp;
		
	}
	
	public static Stack<String> removeEveryOther(Stack<String> one){
		Stack<String> temp = new Stack<String>();
		int count = 1;
		
		while(!one.isEmpty()){
			if(count%2== 0){
				one.pop();
			}
			else
				temp.push(one.pop());
			count++;
		}
		
		return temp;
	}
	
	public static void display(Stack<String> one){
		String out = "";
		
		while(!one.isEmpty())
			out+=one.pop()+", ";
		
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		Stack<Integer> a = new Stack<Integer>();
		a.push(5);
		a.push(2);
		a.push(7);
		System.out.println(getAverage(a));
		
		System.out.println("");
		Stack<String> b = new Stack<String>();
		b.push("one");
		b.push("two");
		
		Stack<String> c = new Stack<String>();
        c.push("three");
        c.push("four");
        c.push("five");
        display(alternateStack(b,c));
        
        System.out.println("");
        Stack<String> d = new Stack<String>();
        d.push("six");
        d.push("seven");
        d.push("eight");
        d.push("nine");
        d.push("ten");
        display(removeEveryOther(d));
 
	}
	
}
