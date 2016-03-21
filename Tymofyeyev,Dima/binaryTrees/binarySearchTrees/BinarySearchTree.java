package binarySearchTrees;

import static java.lang.System.*;

import java.util.LinkedList;

public class BinarySearchTree {
	private TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public void add(Comparable val) {
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree) {
		if (tree == null)
			return new TreeNode(val);

		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);

		if (dirTest <= 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if (dirTest > 0)
			tree.setRight(add(val, tree.getRight()));

		return tree;
	}

	public void inOrder() {
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	public void preOrder() {
		preOrder(root);
		System.out.println("\n\n");
	}

	private void preOrder(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	public void postOrder() {
		postOrder(root);
		System.out.println("\n\n");
	}

	private void postOrder(TreeNode tree) {
		if (tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
	}

	public void revOrder() {
		revOrder(root);
		System.out.println("\n\n");
	}

	private void revOrder(TreeNode tree) {
		if (tree != null) {
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}

	public int getNumLevels() {
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree) {
		if (tree == null)
			return 0;
		else if (getNumLevels(tree.getLeft()) > getNumLevels(tree.getRight()))
			return 1 + getNumLevels(tree.getLeft());
		else
			return 1 + getNumLevels(tree.getRight());
	}

	public int getNumLeaves() {
		return getNumLeaves(root);
	}

	private int getNumLeaves(TreeNode tree) {
		if (tree != null) {
			if (tree.getLeft() == null && tree.getRight() == null)
				return 1;
			else
				return getNumLeaves(tree.getLeft())
						+ getNumLeaves(tree.getRight());
		} else
			return 0;
	}

	public int getWidth() {
		return 1 + getNumLevels(root.getRight()) + getNumLevels(root.getLeft());
	}

	public int getHeight() {
		return getHeight(root) - 1;
	}

	private int getHeight(TreeNode tree) {
		if (tree == null)
			return 0;
		else if (getHeight(tree.getLeft()) > getHeight(tree.getRight()))
			return 1 + getHeight(tree.getLeft());
		else
			return 1 + getHeight(tree.getRight());
	}

	public int getNumNodes() {
		return getNumNodes(root);
	}

	private int getNumNodes(TreeNode tree) {
		if (tree == null)
			return 0;
		else
			return 1 + getNumNodes(tree.getLeft())
					+ getNumNodes(tree.getRight());
	}

	public boolean isFull() {
		return isFull(root);
	}

	public boolean isFull(TreeNode tree) {
		if (tree != null) {
			if (tree.getLeft() != null && tree.getRight() == null)
				return false;
			else if (tree.getLeft() == null && tree.getRight() != null)
				return false;
			else
				return isFull(tree.getLeft()) && isFull(tree.getRight());
		} else
			return true;
	}

	public TreeNode getLargest(){
		return getLargest(root, root);
	}
	
    private TreeNode getLargest(TreeNode tree, TreeNode max) {
        if (tree != null) {
            if (tree.getLeft() != null
                    && tree.getLeft().getValue().compareTo(max.getValue()) > 0)
                max = tree.getLeft();
            if (tree.getRight() != null
                    && tree.getRight().getValue().compareTo(max.getValue()) > 0)
                max = tree.getRight();
            if (getLargest(tree.getLeft(), max).getValue().compareTo(
            		getLargest(tree.getRight(), max).getValue()) > 0)
                return getLargest(tree.getLeft(), max);
            return getLargest(tree.getRight(), max);
        }
 
        return max;
    }

	public int getSmallest() {
		return (int) getSmallest(root, root).getValue();
	}
	
	private TreeNode getMinNode(TreeNode tree){
		return getSmallest(tree, tree);
	}
	
	private TreeNode getSmallest(TreeNode tree, TreeNode min){
		if (tree != null) {
            if (tree.getLeft() != null
                    && tree.getLeft().getValue().compareTo(min.getValue()) < 0)
                min = tree.getLeft();
            if (tree.getRight() != null
                    && tree.getRight().getValue().compareTo(min.getValue()) < 0)
                min = tree.getRight();
            if (getSmallest(tree.getLeft(), min).getValue().compareTo(
            		getSmallest(tree.getRight(), min).getValue()) < 0)
                return getSmallest(tree.getLeft(), min);
            return getSmallest(tree.getRight(), min);
        }
 
        return min;
	}

	public boolean search(Comparable x) {
		String[] temp = toString().trim().split("  ");
		for (int i = 0; i < temp.length; i++) {
			if (Integer.parseInt(temp[i]) == (Integer) x)
				return true;
		}
		return false;
	}

	public void levelOrder() {
		int h = getHeight(root);
		int i;
		for (i = 1; i <= h; i++)
			levelOrder(root, i);
	}

	private void levelOrder(TreeNode root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.getValue() + " ");
		else if (level > 1) {
			levelOrder(root.getLeft(), level - 1);
			levelOrder(root.getRight(), level - 1);
		}
	}

	public void treeDisplay() {

	}
	

	public void remove(Comparable x) {
		root = remove(x, root);
	}

	private TreeNode remove(Comparable x, TreeNode tree) {
		if (tree != null) {
			int dirTest = x.compareTo(tree.getValue());

			if (dirTest < 0)
				tree.setLeft(remove(x, tree.getLeft()));
			else if (dirTest > 0)
				tree.setRight(remove(x, tree.getRight()));
			else {
				if (tree.getRight() == null)
					tree = tree.getLeft();
				else {
					TreeNode successor = getMinNode(tree.getRight());
					tree.setValue(successor.getValue());
					tree.setRight(remove(successor.getValue(), tree.getRight()));
				}
			}
		}
		return tree;
	}

	public String toString() {
		return toString(root).trim();
	}

	private String toString(TreeNode tree) {
		if (tree == null)
			return "";
		else
			return toString(tree.getLeft()) + " " + tree.getValue() + " "
					+ toString(tree.getRight());
	}
}