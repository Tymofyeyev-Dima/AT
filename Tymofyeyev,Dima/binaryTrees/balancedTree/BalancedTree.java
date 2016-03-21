package balancedTree;

import binarySearchTrees.BinarySearchTree;
import binarySearchTrees.TreeNode;

public class BalancedTree extends BinarySearchTree{
	
	public BalancedTree (int[] data){
		setRoot(balance(data));
	}
	
	public TreeNode balance(int arr[]){
		return balance(arr, 0 , arr.length-1);
	}
	
	private TreeNode balance(int arr[], int start, int end){
		if(start>end)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.setLeft(balance(arr,start,mid-1));
		node.setRight(balance(arr,mid+1,end));
		return node;
	}

	public static void main(String[] args) {
		int[] data = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		BalancedTree x = new BalancedTree(data);
		
		System.out.println("InOrder");
		x.inOrder();
		TreeNode temp = x.getRoot();
		System.out.println("Right Branch");
		
		while (temp!=null){
			System.out.println(temp + " ");
			temp=temp.getRight();
		}

	}
	
	

}
