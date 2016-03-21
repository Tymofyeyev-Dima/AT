package towersOfHanoi;

public class DiskMover
{
	private static int count = 0;
	
	public static void main(String[] args)
	{
		move(1, 3,6);
	}
	
    public static void move(int source, int target, int disks)
    {
        move(source, findOther(source, target), target, disks );
        System.out.println(count);
    }
    
    private static void move (int source, int aux, int target, int disks){
    	if (disks == 1){
        	System.out.println("Move disk from peg "+ source +" to peg "+ target);
        	count ++;
    	}
    	
        else{
        	move(source, target, aux, disks - 1);
        	System.out.println("Move disk from peg "+ source +" to peg "+ target);
        	count ++;
        	move(aux, source,target, disks - 1); 
        }
    }
    
    
    
    private static int findOther(int source, int target){
    	if (source ==1){
    		if (target == 2)
    			return 3;
    		return 2;
    	}
    	
    	else if (source == 2){
    		if (target == 1)
    			return 3;
    		return 1;
    	}
    	
    	else{
    		if (target == 1)
    			return 2;
    		return 1;
    	}
    }
    
    
    
    
}
