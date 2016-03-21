package liverTransplant;

public class Patient implements Comparable{
	
	private String name = "";
	private int num = 0;
	
	public Patient(String name, int num){
		this.name=name;
		this.num=num;
	}

	public String getName(){
		return name;
	}
	
	public int getNum(){
		return num;
	}
	
	@Override
	public int compareTo(Object other) {
		return num - ((Patient) other).getNum();	
	}
	
	public String toString(){
		return " ["+name+", "+num+"] ";
	}
}
