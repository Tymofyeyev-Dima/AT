package oddEven;

import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;
	String[] words;

	public OddEvenSets(String line){
		words = line.split(" ");
		odds =  new TreeSet<Integer>();
		evens =  new TreeSet<Integer>();
		sortEven();
		sortOdd();
	}
	
	private void sortEven(){
		for(int i = 0; i < words.length; i ++){
			if(Integer.parseInt(words[i])%2==0)
				evens.add(Integer.parseInt(words[i]));
		}
	}
	
	private void sortOdd(){
		for(int i = 0; i < words.length; i ++){
			if(Integer.parseInt(words[i])%2!=0)
				odds.add(Integer.parseInt(words[i]));
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n";
	}
}