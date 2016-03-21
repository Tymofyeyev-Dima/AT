package clubs;

public class Student implements Comparable{
	
	private String name;
	private int id;
	
	public Student(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getID(){
		return id;
	}
	
	
	public int hashCode(){
		return 29*name.hashCode()+(new Integer(id).hashCode());
	}
	
	public boolean equals(Object other){
		if(other == null)
			return false;
		else if(other.getClass() != getClass())
			return false;
		return (id==((Student)other).getID() && name.equals(((Student)other).getName()));
	}
	
	public String toString(){
		return name+": "+id;
	}

	@Override
	public int compareTo(Object other) {
		if(name.compareToIgnoreCase(((Student)other).getName())==0)
			return id-((Student)other).getID();
		else
			return name.compareToIgnoreCase(((Student)other).getName());
	}

}
