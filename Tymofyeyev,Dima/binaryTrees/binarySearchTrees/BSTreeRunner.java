package binarySearchTrees;


import static java.lang.System.*;

public class BSTreeRunner{
   public static void main( String args[] ){
 		BinarySearchTree test = new BinarySearchTree();
 		test.add(90);
 		test.add(80);
 		test.add(100);
 		test.add(70);
 		test.add(85);
 		test.add(98);
 		test.add(120);
 		
 		System.out.println("In Order: ");
 		test.inOrder();
 		System.out.println("Pre Order: ");
 		test.preOrder();
 		System.out.println("Post Order: ");
 		test.postOrder();
 		System.out.println("Rev Order: ");
 		test.revOrder();
 		
 		System.out.println("Height: "+test.getHeight());
 		System.out.println("Width: "+test.getWidth());
 		System.out.println("numLevels: "+test.getNumLevels());
 		System.out.println("numLeaves: "+test.getNumLeaves());
 		System.out.println("NumNodes: "+test.getNumNodes());
 		System.out.println("isFull: "+test.isFull());
 		System.out.println("Largest: "+test.getLargest().getValue());
 		System.out.println("Smallest: "+test.getSmallest());
 		System.out.println("Search for 90: "+test.search(90));
 		System.out.println("Search for 170: "+test.search(170));
 		
 		System.out.println(test.toString());
 		
 		
 		
 		
 		
 		
 		
 
   }
}