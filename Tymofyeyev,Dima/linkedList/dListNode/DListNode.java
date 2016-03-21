package dListNode;

public class DListNode{

    private Object value;
    private DListNode next;
    private DListNode previous;

    public DListNode(Object initValue, DListNode initNext, DListNode initPrev){
        value= initValue;
        next = initNext; 
        previous = initPrev;
    }
    
    public Object getValue(){
    	return value;
    }
    
    public DListNode getNext(){
    	return next;
    }
    
    public DListNode getPrevious(){
    	return previous;
    }
    
    public void setValue(Object obj){
    	value = obj;
    }
    
    public void setNext(DListNode temp){
    	next = temp;
    }
    
    public void setPrevious(DListNode temp){
    	previous = temp;
    }

}