package weightedEdges;

public class Edge {
	
	private int cost, distance, speed;
	private String name;
	
	public Edge(String name, int cost, int distance, int speed){
		this.cost=cost;
		this.distance=distance;
		this.speed=speed;	
		this.name=name;
	}
	
	public int getSpeed(){
		return speed;
	}
	
	public int getCost(){
		return cost;
	}
	
	public int getDistance(){
		return distance;
	}
	
	public String toString(){
		return name;
	}

}
