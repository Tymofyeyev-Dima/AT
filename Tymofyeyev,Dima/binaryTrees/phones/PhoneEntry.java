package phones;

public class PhoneEntry implements Comparable{
	
	private String name;
	private String number;
	
	public PhoneEntry(String name, String number){
		this.name=name;
		this.number=number;
	}
	
	public String getName(){
		return name;
	}
	
	public String getNumber(){
		return number;
	}
	
	
	public String toString(){
		return "Name: "+name+"\tNumber: "+number;
	}

	@Override
	public int compareTo(Object arg0) {
		PhoneEntry o = (PhoneEntry) arg0;
		if(this.name.equals(o.getName()))
			return this.number.compareTo(o.getNumber());
		return this.name.compareTo(o.getName());
	}
}
