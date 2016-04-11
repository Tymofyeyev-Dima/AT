package monsters;


import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class PQRunner
{
	public static void main ( String[] args )
	{
		YourPQ test = new YourPQ();

		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many monster would you wish to enter?");
		int input = keyboard.nextInt();
		
		for (int i = 0; i <input; i ++){
			System.out.println("Enter Height: ");
			int ht = keyboard.nextInt();
			System.out.println("Enter Weight: ");
			int wt = keyboard.nextInt();
			System.out.println("Enter Age: ");
			int age = keyboard.nextInt();
			Monster temp = new Monster(ht, wt, age);
			test.add(temp);
		}
		
		System.out.println(test);
		System.out.println("getMin() - " + test.getMin());
		System.out.println("removeMin() - " + test.removeMin());		
		System.out.println(test);
		
		System.out.println("getMin() - " + test.getMin());
		System.out.println("removeMin() - " + test.removeMin());		
		System.out.println(test);
		
		
		//add more test cases
		
			
	}
}