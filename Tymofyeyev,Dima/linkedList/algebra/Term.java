package algebra;

public class Term {
	
	private int coeff;
	private int power;
	
	public Term (int coefficient, int power){
		coeff = coefficient;
		this.power = power;
	}
	
	public Term add(Term t){
		return new Term(coeff+t.getCoefficient(), power);
	}
	
	public Term multyply(Term t){
		return new Term(coeff*t.getCoefficient(), power+t.getPower());
	}
	
	public int getPower(){
		return power;
	}
	
	public int getCoefficient(){
		return coeff;
	}
	
	public String toString(){
		if (power == 0)
			return coeff+"";
		return coeff+"x^"+power;
	}

}
