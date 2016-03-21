package relatives;


import java.io.File;
import java.io.FileNotFoundException;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;



public class Relatives{
	private Map<String,Set<String>> map;

	public Relatives(File f) throws FileNotFoundException{
		map = new TreeMap<String, Set<String>>();
		
		Scanner add = new Scanner(f);
		int c = Integer.parseInt(add.nextLine());
		
		for(int i = 0; i< c; i++)
			setPersonRelative(add.nextLine().trim());
		
		add.close();
	}

	public void setPersonRelative(String line){
		String[] personRelative = line.split(" ");
		if(map.get(personRelative[0])==null){
			Set<String> temp = new TreeSet<String>();
			temp.add(personRelative[1]);
			map.put(personRelative[0], temp);
		}
		else{
			Set<String> temp = map.get(personRelative[0]);
			temp.add(personRelative[1]);
			map.put(personRelative[0], temp);
		}
	}


	public String getRelatives(String person){
		Set<String> people = map.get(person);
		return people.toString();
	}


	public String toString(){
		return map.toString().replaceAll("], ","]\n").replaceAll("}", "").replace("{", "").replaceAll("=", " is related to ");
	}
}