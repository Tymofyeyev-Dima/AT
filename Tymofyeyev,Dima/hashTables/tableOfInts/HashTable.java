package tableOfInts;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class HashTable{
	private LinkedList[] table;

	public HashTable(File f) throws FileNotFoundException{
		table = new LinkedList[10];
		Scanner add = new Scanner(f);
		int c = Integer.parseInt(add.nextLine());
		
		for(int i = 0; i< c; i++)
			add(add.nextInt());
		
		add.close();
	}

	public void add(int obj){
		Number temp = new Number(obj);
		int i = temp.hashCode();
		
		if(table[i]==null)
			table[i] = new LinkedList<Number>();
		if(!table[i].contains(temp))
			table[i].addLast(temp);
	}

	public String toString(){
		String output="HASHTABLE\n";
		for(int i = 0; i<table.length; i ++)
			output+="Bucket "+i+": "+table[i].toString()+"\n";
		return output;
	}
}