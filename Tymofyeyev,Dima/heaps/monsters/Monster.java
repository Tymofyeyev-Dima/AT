package monsters;

public class Monster{

	private int ht, wt, age;
	
	public Monster(int height, int weight, int age){
		ht = height;
		wt = weight;
		this.age = age;
	}
	
	public void setWeight(int wt){
		this.wt = wt;
	}
	
	public void setHeight(int ht){
		this.ht = ht;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public Object clone(){
		return new Monster(ht, wt, age);
	}

	public int getHeight() {
		return ht;
	}

	public int getWeight() {
		return wt;
	}

	public int getAge() {
		return age;
	}
	
	public boolean equals(Object o){
		return ((Monster) o).getWeight() == wt && ((Monster) o).getHeight() == ht && ((Monster) o).getAge() == age;
	}

	public int compareTo(Monster other) {
		if(equals(other))
			return 0;
		else if (other.getHeight()!=ht)
			return other.getHeight()-ht;
		else if (other.getWeight()!=wt)
			return other.getWeight()-wt;
		else
			return -1;
		
	}
	
	public String toString(){
		return "Height: "+ht+"| Weight: "+wt+"| Age: "+age;
	}
	
	
	
	
}
