package wrestlers;

import java.util.ArrayList;
import java.util.HashMap;

public class TeamMap {
	private HashMap<Integer, ArrayList<Wrestler>> wrestlers = new HashMap<Integer, ArrayList<Wrestler>>();
	
	public TeamMap(Wrestler smith){
		ArrayList<Wrestler> temp = new ArrayList<Wrestler>();
		temp.add(smith);
		wrestlers.put(smith.getGroup(), temp);
	}
	
	public void addWrestler(Wrestler smith){
		int group = smith.getGroup();
		if(wrestlers.containsKey(group)){
			ArrayList<Wrestler> temp = wrestlers.get(group);
			temp.add(smith);
			wrestlers.put(group, temp);
		}
		else{
			ArrayList<Wrestler> temp = new ArrayList<Wrestler>();
			temp.add(smith);
			wrestlers.put(smith.getGroup(), temp);
		}
			
	}
	
	public void changeWeightGroup(Wrestler smith, int group){
		ArrayList<Wrestler> temp = wrestlers.get(smith.getGroup());
		int key = 0;
		for(int i = 0; i < temp.size(); i ++){
			if (temp.get(i).getName().compareToIgnoreCase(smith.getName())==0){
				key = temp.get(i).getGroup();
				temp.get(i).changeGroup(group);
			}
		}
		
		wrestlers.put(smith.getGroup(),temp);
		wrestlers.remove(key);
	}

	public int getWrestlerGroup(Wrestler smith) {
		return smith.getGroup();
	}
	
	public String toString(){
		return wrestlers.toString();
		
		
	}

}
