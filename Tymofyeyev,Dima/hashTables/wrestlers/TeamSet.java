package wrestlers;

import java.util.HashSet;

public class TeamSet {
	private HashSet<Wrestler> wrestlers;
	
	public TeamSet(Wrestler smith){
		wrestlers = new HashSet<Wrestler>();
		wrestlers.add(smith);
	}
	
	public void addWrestler(Wrestler smith){
		wrestlers.add(smith);
	}
	
	public double getAverageWeight(){
		double sum = 0;
		int count = 0;
		for(Wrestler w:wrestlers){
			sum+=w.getWeight();
			count++;
		}	
		return sum/count;
	}
	
	public HashSet getLightWeight(){
		HashSet<Wrestler> light = new HashSet<Wrestler>();
		for(Wrestler w:wrestlers)
			if(w.getWeight()<120)
				light.add(w);
		return light;
	}
	
	public String toString(){
		return wrestlers.toString();
	}
}
