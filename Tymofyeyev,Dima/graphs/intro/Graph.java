package intro;

import java.util.TreeMap;

public class Graph {
	private TreeMap<String, String> map;
	public boolean yahOrNay;

	public Graph(String line) {
		map = new TreeMap<String, String>();
		yahOrNay = false;
		String[] pair = line.split(" ");
		for (int x = 0; x < pair.length; x++) {
			if (map.isEmpty()) {
				map.put(pair[x].substring(0, 1), pair[x].substring(1));
				map.put(pair[x].substring(1), pair[x].substring(0, 1));
			} else {
				String first = pair[x].substring(0, 1);
				String second = pair[x].substring(1);
				if (containsMap(first)) {
					map.put(first, map.get(first) + second);
				} else
					map.put(first, second);

				if (containsMap(second)) {
					map.put(second, map.get(second) + first);
				} else
					map.put(second, first);
			}
		}

		//System.out.println(map);
	}

	public boolean containsMap(String letter) {
		return map.containsKey(letter);
	}

	public void check(String first, String second, String placesUsed) {
		if (!yahOrNay) {
			if (map.get(first).contains(second))
				yahOrNay = true;
			else {
				String temp = map.get(first);
				for (int i = 0; i < temp.length(); i++)
					if (!placesUsed.contains(temp.substring(i, i + 1))) {
						placesUsed += temp.substring(i, i + 1);
						check(temp.substring(i, i + 1), second, placesUsed);
					}
			}
		}
	}

	public String toString() {
		return "";
	}
}