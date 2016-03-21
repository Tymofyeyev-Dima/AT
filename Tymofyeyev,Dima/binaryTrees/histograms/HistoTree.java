package histograms;

import static java.lang.System.*;
import binarySearchTrees.TreeNode;

public class HistoTree{
   private HistoNode root;

	public HistoTree( ){
		root = null;
	}

	public void addData(Comparable data){
		root = add(data, root);
	}

	private HistoNode add(Comparable data, HistoNode tree){
		if (tree == null)
			return new HistoNode(data, 1, null, null);

		Comparable treeValue = tree.getData();
		int dirTest = data.compareTo(treeValue);

		if (dirTest < 0)
			tree.setLeft(add(data, tree.getLeft()));
		else if (dirTest > 0)
			tree.setRight(add(data, tree.getRight()));
		else if(dirTest == 0)
			tree.setDataCount(tree.getDataCount()+1);

		return tree;
	}

	public HistoNode search(Comparable data){
		return search(data, root);
	}

	private HistoNode search(Comparable data, HistoNode tree){
		if(tree == null)
			return null;
	}

	public String toString(){
		return toString(root);
	}

	private String toString(HistoNode tree){
		if (tree == null)
			return "";
		else
			return toString(tree.getLeft()) + " " + tree.getData() + " "
					+ toString(tree.getRight());
	}
}