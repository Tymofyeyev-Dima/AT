package shortestPath;

import java.util.TreeMap;

public class ShortestPathGraph {
	private TreeMap<String, String> map;
	public boolean yayOrNay;
	public int shortest;

	public ShortestPathGraph(String line) {
		map = new TreeMap<String, String>();
		yayOrNay = false;
		shortest = 0;
		
		String[] pair = line.split(" ");
		for (int x = 0; x < pair.length; x++) {
			if (map.isEmpty()) {
				map.put(pair[x].substring(0, 1), pair[x].substring(1));
				map.put(pair[x].substring(1), pair[x].substring(0, 1));
			} 
			else {
				String first = pair[x].substring(0, 1);
				String second = pair[x].substring(1);
				if (contains(first))
					map.put(first, map.get(first) + second);
				else
					map.put(first, second);

				if (contains(second))
					map.put(second, map.get(second) + first);
				else
					map.put(second, first);
			}
		}
	}

	public boolean contains(String letter) {
		return map.containsKey(letter);
	}

	public void check(String first, String second, String placesUsed, int steps) {
		if (!yayOrNay) {
			if (map.get(first).contains(second)) {
				if(shortest == 0 || steps < shortest)
					shortest = steps;
				yayOrNay = true;
			} 
			else {
				String temp = map.get(first);
				for (int i = 0; i < temp.length(); i++)
					if (!placesUsed.contains(temp.substring(i, i + 1))) {
						placesUsed += temp.substring(i, i + 1);
						check(temp.substring(i, i + 1), second, placesUsed, steps + 1);
					}			
			}
		}
	}

	public String toString() {
		return "";
	}
}