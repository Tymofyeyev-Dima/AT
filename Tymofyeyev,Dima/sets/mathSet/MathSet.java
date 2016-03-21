package mathSet;


import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

import static java.lang.System.*;

public class MathSet
{
	private Set<String> one, two;
	String[] o1, t2;

	public MathSet(String o, String t){
		o1 = o.split(" ");
		t2 = t.split(" ");
		one =  new TreeSet<String>(Arrays.asList(o1));
		two =  new TreeSet<String>(Arrays.asList(t2));
	}

	public Set<Integer> union(){
		Set<Integer> union = new TreeSet<Integer>();
		
		for(int i = 0; i < o1.length; i ++)
			union.add(Integer.parseInt(o1[i]));
		for(int j = 0; j < t2.length; j ++)
			union.add(Integer.parseInt(t2[j]));
		return union;	
	}

	public Set<Integer> intersection(){
		Set<Integer> out = new TreeSet<Integer>();
		Set<Integer> inter = new TreeSet<Integer>();
		
		for(int i = 0; i < o1.length; i ++)
			out.add(Integer.parseInt(o1[i]));
		for(int j = 0; j < t2.length; j ++)
			if(!out.add(Integer.parseInt(t2[j])))
				inter.add(Integer.parseInt(t2[j]));
		return inter;
	}

	public Set<Integer> differenceAMinusB(){
		Set<Integer> out = union();
		for(String i :two)
			out.remove(Integer.parseInt(i));
		return out;
	}

	public Set<Integer> differenceBMinusA(){
		Set<Integer> out = union();
		for(String i : one)
			out.remove(Integer.parseInt(i));
		return out;
	}
	
	public Set<Integer> symmetricDifference(){		
		Set<Integer> out = union();
		Set<Integer> toRemove = intersection();
		
		for(Integer i: toRemove)
			out.remove(i);
		return out;
	}	
	
	public String toString(){
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}