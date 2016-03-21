package monster;

import java.util.Scanner;



public class MonsterPQRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many monster would you wish to enter?");
		int input = keyboard.nextInt();
		
		MonsterPQ test = new MonsterPQ();
		
		for (int i = 0; i <input; i ++){
			System.out.println("Enter Age: ");
			int age = keyboard.nextInt();
			System.out.println("Enter Height: ");
			int ht = keyboard.nextInt();
			System.out.println("Enter Weight: ");
			int wt = keyboard.nextInt();
			Monster temp = new Monster(age, ht, wt);
			test.add(temp);
		}
		
		System.out.println(test);
		System.out.println(test.getMin());
		System.out.println(test.removeMin());
		System.out.println(" ");
		
		System.out.println(test);
		System.out.println(test.getMin());
		System.out.println(test.removeMin());
		System.out.println(" ");
		
		System.out.println(test);
		
		
		
		
		
//		Monster a = new Monster(10, 6, 160);
//		Monster b = new Monster (10, 6, 100);
//		Monster c = new Monster (2, 3, 20);
//		Monster d = new Monster (10, 6, 160);
//		Monster e = new Monster (14, 7, 200);
//
//		System.out.println(a.equals(b));
//		System.out.println(a.equals(d));
//		System.out.println(a.compareTo(c));
//		System.out.println(a.compareTo(e));
//		System.out.println(a);
//		
//		MonsterPQ test = new MonsterPQ();
//		test.add(a);
//		test.add(b);
//		test.add(c);
//		System.out.println(test);
//		
//		System.out.println(test.getMin());
	}
}