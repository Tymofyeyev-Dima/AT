package morseCode;

import java.util.ArrayList;

import binarySearchTrees.TreeNode;

public class MorseTree {

	TreeNode root;
	ArrayList<Letters> letters;

	public MorseTree() {
		root = new TreeNode(" ");
		letters = new ArrayList<Letters>();
		createArrayList();
		createTree(root);
	}

	public void toEnglish(String input) {
		translateToEnglish(input.replaceAll("/", ""), root); // Replace all may
		// be incorrect
	}

	private void translateToEnglish(String input, TreeNode tree) {
		String[] words = input.split(" ");
		TreeNode og = tree;
		for (int i = 0; i < words.length; i++) {
			tree = og;
			char[] temp = words[i].toCharArray();
			for (int j = 0; j < temp.length; j++) {
				if (temp[j] == '.')
					tree = tree.getRight();
				else if (temp[j] == '-')
					tree = tree.getLeft();
			}
			System.out.print(tree.getValue());
		}
	}

	public void toMorse(String input){
		for(String word : input.split(" ")){
			for(char c : word.toCharArray())
				System.out.print(letters.get(c - 65).getValue()+" ");

			System.out.print("/ ");
		}
	}

	private void createArrayList() {
		letters.add(new Letters(".-")); // A
		letters.add(new Letters("-...")); // B
		letters.add(new Letters("-.-.")); // C
		letters.add(new Letters("-..")); // D
		letters.add(new Letters(".")); // E
		letters.add(new Letters("..-.")); // F
		letters.add(new Letters("--.")); // G
		letters.add(new Letters("....")); // H
		letters.add(new Letters("..")); // I
		letters.add(new Letters(".---")); // J
		letters.add(new Letters("-.-")); // K
		letters.add(new Letters(".-..")); // L
		letters.add(new Letters("--")); // M
		letters.add(new Letters("-.")); // N
		letters.add(new Letters("---")); // O
		letters.add(new Letters(".--.")); // P
		letters.add(new Letters("--.-")); // Q
		letters.add(new Letters(".-.")); // R
		letters.add(new Letters("...")); // S
		letters.add(new Letters("-")); // T
		letters.add(new Letters("..-")); // U
		letters.add(new Letters("...-")); // V
		letters.add(new Letters(".--")); // W
		letters.add(new Letters("-..-")); // X
		letters.add(new Letters("-.--")); // Y
		letters.add(new Letters("--..")); // Z
	}

	private void createTree(TreeNode root) {
		root.setRight(new TreeNode("E"));
		root.getRight().setRight(new TreeNode("I"));
		root.getRight().setLeft(new TreeNode("A"));
		root.getRight().getRight().setRight(new TreeNode("S"));
		root.getRight().getRight().setLeft(new TreeNode("U"));
		root.getRight().getRight().getLeft().setLeft(new TreeNode("-"));
		root.getRight().getRight().getLeft().getLeft()
		.setLeft(new TreeNode("2"));
		root.getRight().getRight().getRight().setRight(new TreeNode("H"));
		root.getRight().getRight().getRight().setLeft(new TreeNode("V"));
		root.getRight().getRight().getLeft().setRight(new TreeNode("F"));
		root.getRight().getLeft().setLeft(new TreeNode("W"));
		root.getRight().getLeft().setRight(new TreeNode("R"));
		root.getRight().getLeft().getRight().setRight(new TreeNode("L"));
		root.getRight().getLeft().getLeft().setRight(new TreeNode("P"));
		root.getRight().getLeft().getLeft().setLeft(new TreeNode("J"));
		root.getRight().getLeft().getLeft().getLeft()
		.setLeft(new TreeNode("1"));

		root.setLeft(new TreeNode("T"));
		root.getLeft().setLeft(new TreeNode("M"));
		root.getLeft().setRight(new TreeNode("N"));
		root.getLeft().getRight().setLeft(new TreeNode("K"));
		root.getLeft().getRight().setRight(new TreeNode("D"));
		root.getLeft().getRight().getRight().setLeft(new TreeNode("X"));
		root.getLeft().getRight().getRight().setRight(new TreeNode("B"));
		root.getLeft().getRight().getRight().getRight()
		.setRight(new TreeNode("6"));
		root.getLeft().getRight().getLeft().setLeft(new TreeNode("Y"));
		root.getLeft().getRight().getLeft().setRight(new TreeNode("C"));
		root.getLeft().getLeft().setLeft(new TreeNode("O"));
		root.getLeft().getLeft().setRight(new TreeNode("G"));
		root.getLeft().getLeft().getLeft().setLeft(new TreeNode("Q"));
		root.getLeft().getLeft().getLeft().setRight(new TreeNode("Z"));
		root.getLeft().getLeft().getLeft().getRight()
		.setRight(new TreeNode("7"));
		root.getLeft().getLeft().getLeft().setRight(new TreeNode("."));
		root.getLeft().getLeft().getLeft().getRight()
		.setRight(new TreeNode("8"));
		root.getLeft().getLeft().getLeft().setLeft(new TreeNode("@"));
		root.getLeft().getLeft().getLeft().getLeft().setLeft(new TreeNode("0"));
		root.getLeft().getLeft().getLeft().getLeft()
		.setRight(new TreeNode("9"));
	}

}
