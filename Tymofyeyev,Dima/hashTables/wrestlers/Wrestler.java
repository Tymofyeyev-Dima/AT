package wrestlers;

public class Wrestler {
	
	private String name;
	private int weight;
	private int group;
	
	public Wrestler(String name, int weight){
		this.name=name;
		this.weight=weight;
		group=group();
	}
	
	public int getWeight(){
		return weight;
	}
	
	public String getName(){
		return name;
	}
	
	public void changeGroup(int num){
		group = num;
	}
	
	public int getGroup(){
		return group;
	}
	
	private int group(){
		if (weight>=100 && weight<110)
			return 0;
		else if (weight>=110 && weight<120)
			return 1;
		else if(weight>=120 && weight<130)
			return 2;
		else if(weight>=130 && weight<140)
			return 3;
		else if(weight>=140 && weight<150)
			return 4;
		else if(weight>=150 && weight<160)
			return 5;
		else if(weight>=160 && weight<170)
			return 6;
		else if(weight>=170 && weight<180)
			return 7;
		else if(weight>=180 && weight<190)
			return 8;
		else
			return 9;
	}
	
	public String toString(){
		return name+": "+group;
	}

}
