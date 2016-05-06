package weightedEdges;

import java.util.ArrayList;

public class Node {
	
	private ArrayList<Edge> paths;
	
	public Node(){
		paths = new ArrayList<Edge>();
	}
	
	public void addPath(Edge e){
		paths.add(e);
	}
	
	public void removePath(Edge e){
		paths.remove(e);
	}
	
	public String getAllPaths(){
		String out = "";
		for(int i = 0; i < paths.size(); i ++)
			out += paths.get(i).toString()+ ", ";
		return out;	
	}

}
