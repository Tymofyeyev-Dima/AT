package phone;

public class PhoneEntry {
	private String name;
	private int number;
	
	public PhoneEntry(String name, int number){
		this.name=name;
		this.number=number;
	}
	
	public int hashCode(){
		return number;
	}
	
	public String getName(){
		return name;
	}
	
	public int getNum(){
		return number;
	}
	
	public void changeNum(int newNum){
		number=newNum;
	}
	
	public String toString(){
		return name+" :"+number+"\t";
	}

}
