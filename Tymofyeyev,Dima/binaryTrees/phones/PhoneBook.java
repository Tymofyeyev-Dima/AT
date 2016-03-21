package phones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import binarySearchTrees.BinarySearchTree;
import binarySearchTrees.TreeNode;

public class PhoneBook {
	private TreeNode root;

	public PhoneBook(File f) throws FileNotFoundException {
		root = null;

		Scanner add = new Scanner(f);
		int c = Integer.parseInt(add.nextLine());

		for (int i = 0; i < c; i++) {
			String[] temp = add.nextLine().trim().split(" ");
			String name = temp[0];
			String phone = temp[1];
			add(new PhoneEntry(name, phone));
		}
		add.close();
	}

	public void add(PhoneEntry newPerson) {
		root = add(newPerson, root);
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

	public void display() {
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree) {
		if (tree != null) {
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " \n");
			inOrder(tree.getRight());
		}
	}

	public String lookupNumber(String lookForName) {
		return lookupNumber(lookForName, root);
	}

	private String lookupNumber(String name, TreeNode tree) {
		if (tree != null) {
			if (((PhoneEntry) tree.getValue()).getName().equals(name))
				return ((PhoneEntry) tree.getValue()).getNumber();
			else if (((PhoneEntry) tree.getValue()).getName().compareTo(name) > 0)
				return lookupNumber(name, tree.getLeft());
			else
				return lookupNumber(name, tree.getRight());
		}
		return "-1";
	}

	public String reverseLookup(String number) {
		return searchByNumber("-1", root, number);
	}

	private String searchByNumber(String name, TreeNode tree, String number) {
		if (tree != null)
			if ((tree.getLeft() != null && ((PhoneEntry) tree.getLeft().getValue()).getNumber().equals(number)))
				return ((PhoneEntry) tree.getLeft().getValue()).getName();
			else if (tree.getRight() != null && ((PhoneEntry) tree.getRight().getValue()).getNumber().equals(number))
				return ((PhoneEntry) tree.getRight().getValue()).getName();
			else {
				if (!searchByNumber(name, tree.getLeft(), number).equals("-1"))
					return searchByNumber(name, tree.getLeft(), number);
				else if (!searchByNumber(name, tree.getRight(), number).equals("-1"))
					return searchByNumber(name, tree.getRight(), number);
			}

		return "-1";
	}

	public void delete(String deletedName) {
		root = remove(deletedName, root);
	}

	private TreeNode remove(String name, TreeNode tree) {
		if (tree != null) {
			String temp = ((PhoneEntry) tree.getValue()).getName();
			int dirTest = name.compareTo(temp);

			if (dirTest < 0)
				tree.setLeft(remove(name, tree.getLeft()));
			else if (dirTest > 0)
				tree.setRight(remove(name, tree.getRight()));
			else {
				if (tree.getRight() == null)
					tree = tree.getLeft();
				else {
					TreeNode successor = getSmallest(tree.getRight(),
							tree.getRight());
					tree.setValue(successor.getValue());
					tree.setRight(remove(
							((PhoneEntry) successor.getValue()).getName(),
							tree.getRight()));
				}
			}
		}
		return tree;
	}

	private TreeNode getSmallest(TreeNode tree, TreeNode min) {
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
}
