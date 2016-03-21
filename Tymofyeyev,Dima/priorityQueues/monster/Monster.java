package monster;

public class Monster {
	
	private int ht, wt, age;
	
	public Monster(int age, int ht, int wt){
		this.ht = ht;
		this.wt = wt;
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
	
	public int getWeight(){
		return wt;
	}
	
	public int getHeight(){
		return ht;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean equals(Object o){
		return ((Monster)o).getWeight() == wt && ((Monster)o).getHeight() == ht && ((Monster)o).getAge() == age;
	}
	
	public int compareTo(Monster rhs){
		if (equals(rhs))
			return 0;
		else if (rhs.getAge()!=age){
			if(rhs.getAge()>age)
				return 1;
			else 
				return -1;
		}
		else if (rhs.getHeight()!=ht){
			if(rhs.getHeight()>ht)
				return 1;
			else 
				return -1;
		}
		else if (rhs.getWeight()!=wt){
			if(rhs.getWeight()>wt)
				return 1;
			else 
				return -1;
		}
		else
			return -1;	
	}
	
	public String toString(){
		return "Height: "+ht+" |Weight: "+wt+" |Age: "+age;
		
	}

}
