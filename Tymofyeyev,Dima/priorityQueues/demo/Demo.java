package demo;

import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(9);
		pQueue.add(11);
		pQueue.add(1);
		pQueue.add(7);
		System.out.println(pQueue);
		System.out.println(pQueue.remove());
		System.out.println(pQueue);
		System.out.println(pQueue.remove());
		System.out.println(pQueue);

	}

}
