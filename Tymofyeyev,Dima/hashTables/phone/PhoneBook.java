package phone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import clubs.Student;
import tableOfInts.HashTable;
import tableOfInts.Number;

public class PhoneBook {
	private LinkedList[] table;
	private int buckets;

	public PhoneBook(){
		table = new LinkedList[10];
		buckets=10;
	}
	
	public PhoneBook(int numSlots){
		table = new LinkedList[numSlots];
		buckets= numSlots;
	}
	
	public void add(Object obj){
		int i = ((PhoneEntry) obj).hashCode()%buckets;
		if(table[i]==null)
			table[i] = new LinkedList<PhoneEntry>();
		if(!table[i].contains(obj))
			table[i].addLast(obj);
	}
	
	public void display(){
		for(int i = 0; i < table.length; i ++){
			String out = "";
			if(table[i]!=null){
				for(Object ppl:table[i]){
					out += ((PhoneEntry) ppl).toString();
				}	
			}
			System.out.println(out);
		}
	}
	
	public int getCapacity(){
		return table.length;
	}
	
	public int getSize(){
		int count = 0;
		for(int i = 0; i <table.length; i ++)
			if(table[i]!=null)
				count++;
		return count;
	}
	
	public void load(File f) throws FileNotFoundException{
		Scanner add = new Scanner(f);
		int c = Integer.parseInt(add.nextLine());
		
		for(int i = 0; i< c; i++){
			String[] temp = add.nextLine().split(" ");
			PhoneEntry person = new PhoneEntry(temp[0], Integer.parseInt(temp[1]));
			add(person);
		}
		
		add.close();
		
	}
	
	public int getNumberOfNulls(){
		int count = 0;
		for(int i = 0; i <table.length; i ++)
			if(table[i]==null)
				count++;
		return count;
	}
	
	public int getLongestList(){
		int max = table[0].size();
		for(int i = 1; i < table.length; i ++)
			if(table[i].size() > max)
				max=table[i].size();
		return max;
		
	}
	
	public String lookup(String lookfor){
		for(int i = 0; i < table.length; i++){
			for(Object ppl: table[i]){
				if(lookfor.compareToIgnoreCase(((PhoneEntry) ppl).getName()) == 0)
					return ((PhoneEntry) ppl).getNum() +"";
			}
		}
		return "-1";
	}
	
	private PhoneEntry lookup2(String lookfor){
		for(int i = 0; i < table.length; i++){
			for(Object ppl: table[i]){
				if(lookfor.compareToIgnoreCase(((PhoneEntry) ppl).getName()) == 0)
					return (PhoneEntry) ppl;
			}
		}
		return null;
	}
	
	public boolean changeNumber(String lookFor, String newNumb){
		PhoneEntry temp = lookup2(lookFor);
		if(temp == null)
			return false;
		else{
			temp.changeNum(Integer.parseInt(newNumb));
			return true;
		}
	}
}
