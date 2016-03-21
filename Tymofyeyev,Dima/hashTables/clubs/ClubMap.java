package clubs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;


public class ClubMap {
	
	private HashMap<String, TreeSet<Student>> clubList;
	
	public ClubMap(File f) throws FileNotFoundException{
		clubList = new HashMap<String, TreeSet<Student>>();
		Scanner add = new Scanner(f);
		int c = Integer.parseInt(add.nextLine());
		
		for(int i = 0; i< c; i++){
			String[] temp = add.nextLine().trim().split(" ");
			String name = temp[0]+" "+temp[1];
			int id = Integer.parseInt(temp[2]);
			String club = temp[3];
			addStudent(new Student(name, id), club);
		}
		
		add.close();
	}
	
	public void addStudent(Student smith, String clubName){
		if(!clubList.containsKey(clubName)){
			TreeSet<Student> temp = new TreeSet<Student>();
			temp.add(smith);
			clubList.put(clubName, temp);
		}
		else{
			TreeSet<Student> temp = clubList.get(clubName);
			temp.add(smith);
			clubList.put(clubName, temp);
		}
	}
	
	public String getClubRoster(String clubName){
		TreeSet<Student> temp = clubList.get(clubName);
		return temp.toString();
	}
	
	public void printAllClubs(){
		Object[] keys = clubList.keySet().toArray();
		Arrays.sort(keys);
		for(Object club: keys)
			System.out.println(club+":: "+clubList.get(club));
//		for(Map.Entry<String, TreeSet<Student>> entry : clubList.entrySet()){
//			System.out.println(entry.toString());
//		}
	}
	
	

}
