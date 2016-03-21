package tableOfInts;


public class Number{
	private int theValue;
	
	public Number(int value){
		theValue = value;
	}	
	
	public int getValue(){
		return theValue;
	}
	
	public boolean equals(Object obj){
		return theValue == ((Number) obj).getValue(); // change this
	} 
	
	public int hashCode(){
		return (theValue%10); // change this
	}

	public String toString(){
		return ""+theValue;
	}	
}