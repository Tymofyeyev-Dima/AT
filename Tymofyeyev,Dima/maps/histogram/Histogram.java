package histogram;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram(String sent){
		histogram = new TreeMap<String, Integer>();
		setSentence(sent);
	}
	
	public void setSentence(String sent){
		String[] chars = sent.split(" ");
		for(int i = 0; i < chars.length; i++){
			if(histogram.get(chars[i])==null)
				histogram.put(chars[i], 1);
			else
				histogram.put(chars[i], histogram.get(chars[i])+1);	
		}
	}
	
	private String getStars(int num){
		String out = "";
		for(int i = 0; i < num; i++)
			out +="*";
		return out;
	}

	public void print(){
		Set<String> keys = histogram.keySet();
		Object[] out = keys.toArray();
		
		for(int i = 0; i < out.length; i++)
			System.out.println(out[i] +"\t\t"+ getStars(histogram.get(out[i])));
	}
}