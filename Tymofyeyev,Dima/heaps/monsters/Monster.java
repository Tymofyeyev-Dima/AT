package monsters;

public class Monster implements Comparable{

	private int ht, wt, age;
	
	public Monster(int height, int weight, int age) {
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
	
	@Override
	public int compareTo(Object o) {
		if(equals(((Monster) o)))
			return 0;
		else if (((Monster) o).getHeight()!=ht)
			return ht - ((Monster) o).getHeight();
		else if (((Monster) o).getWeight()!=wt)
			return wt -((Monster) o).getWeight();
		else if(((Monster) o).getAge()!=age)
			return age - ((Monster) o).getAge();
		else
			return -1;
		
	}
	
	public String toString(){
		return "Height: "+ht+"| Weight: "+wt+"| Age: "+age;
	}
	
	
	
	
}
