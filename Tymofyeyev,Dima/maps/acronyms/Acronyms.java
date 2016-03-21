package acronyms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Acronyms{
	private Map<String,String> acronymTable;

	public Acronyms(File f) throws FileNotFoundException{
		acronymTable = new TreeMap<String,String>();
		Scanner add = new Scanner(f);
		int c = Integer.parseInt(add.nextLine());
		
		for(int i = 0; i< c; i++)
			putEntry(add.nextLine().trim());
		
		add.close();
	}

	public void putEntry(String entry){
		String[] list = entry.split("-"); 
		acronymTable.put(list[0].trim(), list[1].trim());
	}

	public String convert(String sent){
		Scanner chop = new Scanner(sent);
		String output ="";
		while(chop.hasNext()){
			String word = chop.next().replace(".", "");
			if(!acronymTable.containsKey(word))
				output += word+ " ";
			else
				output += acronymTable.get(word)+" ";
		}
		chop.close();
		return output;
	}

	public String toString(){
		return acronymTable.toString();
	}
}