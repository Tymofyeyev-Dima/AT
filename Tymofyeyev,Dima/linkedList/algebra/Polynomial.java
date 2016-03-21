package algebra;

import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial
{
	private LinkedList<Term> termList;
    
	public Polynomial(){
    	termList = new LinkedList<Term>();
    }
	
	public Polynomial(int c1, int e1){
		termList = new LinkedList<Term>();
		Term term = new Term(c1, e1);
		termList.addLast(term);
	}
    

    public Polynomial(int c1, int e1, int c2, int e2, int c3, int e3){
        termList = new LinkedList<Term>();
        Term term1 = new Term(c1,e1);
        Term term2 = new Term(c2,e2);
        Term term3 = new Term(c3,e3);

        termList.addLast(term1);
        termList.addLast(term2);
        termList.addLast(term3);
    }
    
    
   
    public Polynomial add(Polynomial p2){
        Polynomial result = new Polynomial();
        ListIterator<Term> itr = termList.listIterator();
        ListIterator<Term> itr2 = p2.termList.listIterator();
        Term myTerm;
        Term p2Term;

        while (itr.hasNext() && itr2.hasNext()) {
        	myTerm = itr.next();
        	itr.previous();
        	p2Term = itr2.next();
        	itr2.previous();
            
        	if (myTerm.getPower() == p2Term.getPower()){
                Term Term1 = new Term((myTerm.getCoefficient() + p2Term.getCoefficient()),myTerm.getPower());
                result.termList.addLast(Term1);
                itr.next();
                itr2.next();
        	}

        	else if (myTerm.getPower() < p2Term.getPower()){
                Term Term2 = new Term(p2Term.getCoefficient(),p2Term.getPower());
                result.termList.addLast(Term2);
                itr2.next();
        	}

        	else {
                Term Term3 = new Term(myTerm.getCoefficient(),myTerm.getPower());
                result.termList.addLast(Term3);
                itr.next();
        	}
        }

        while (itr.hasNext()){
        	myTerm = itr.next();
            Term Term4 = new Term(myTerm.getCoefficient(),myTerm.getPower());
            result.termList.addLast(Term4);
        }

        while (itr2.hasNext()){
        	p2Term = itr2.next();
            Term Term5 = new Term(p2Term.getCoefficient(),p2Term.getPower());
            result.termList.addLast(Term5);
        }
        return result;
    }
    
   public Polynomial multiply(Polynomial p2) {
	   Polynomial result = new Polynomial();
       ListIterator<Term> itr = termList.listIterator();
       ListIterator<Term> itr2 = p2.termList.listIterator();
       Term myTerm;
       Term p2Term;

       while (itr2.hasNext()){
            p2Term = itr2.next();
            Polynomial newresult = new Polynomial();
            while (itr.hasNext()){
                myTerm = itr.next();
                Term Term1 = new Term((myTerm.getCoefficient() * p2Term.getCoefficient()),(myTerm.getPower() + p2Term.getPower()));
                newresult.termList.addLast(Term1);
            }
            
            itr = termList.listIterator();
            result = result.add(newresult);
        }
        return result;
    }
    
   public Polynomial derivative(){
        Polynomial result = new Polynomial();
        ListIterator<Term> itr = termList.listIterator();
        Term theTerm;
        
        while (itr.hasNext()){
        	theTerm = itr.next();
            Term Term1 = new Term((theTerm.getCoefficient() * theTerm.getPower()),(theTerm.getPower()-1));
            result.termList.addLast(Term1);
        }
        return result;
    }

    public String toString(){
	ListIterator<Term> itr = termList.listIterator();
	Term nextTerm;
	String result = "";
	boolean firstTime = true;

	while (itr.hasNext()) {
	    nextTerm = itr.next();
	    if ((nextTerm.getCoefficient() > 0) && !firstTime)
	    	result += "+ ";
	    firstTime = false;
            
	    	if (nextTerm.getCoefficient() == 0)
                result += "";
            else if (nextTerm.getPower() == 1)
                result += nextTerm.getCoefficient() + "x" + " ";
            else if (nextTerm.getCoefficient() == 1)
                result += "x^" + nextTerm.getPower() + " ";
            else if (nextTerm.getCoefficient() == -1)
                result += "-x^" + nextTerm.getPower() + " ";
            else if (nextTerm.getPower() == 0)
                result += nextTerm.getCoefficient() + " ";
            else
                result += nextTerm.getCoefficient() + "x^" + nextTerm.getPower() + " ";
	}
    
	if (result == "")
            result = "0";
	
	return result;
    }

public static void main (String[] args)
   {
       Polynomial p2 = new Polynomial(2,2, 1,1,0,0);
       System.out.println(p2);
       
       Polynomial p3 = new Polynomial(2,2, -4,1,0,0);
       System.out.println(p3);
       
       Polynomial p4 = new Polynomial(4,4);
       
       System.out.println("");
      System.out.println(p3.add(p4));
      	System.out.println(p3.add(p2));
       System.out.println(p3.multiply(p2));
       System.out.println(p3.derivative());
     
}
}







































