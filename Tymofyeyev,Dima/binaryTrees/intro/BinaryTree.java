package intro;

public abstract class BinaryTree {

	TreeNode root;

	public BinaryTree() {
		root = null;
	}

	public void setRoot(TreeNode theNewNode) {
		root = theNewNode;
	}

	public TreeNode getRoot() {

		return root;
	}

	boolean isEmpty() {
		return (root == null);
	}

	public abstract void insert(Comparable item);

	public abstract TreeNode find(Comparable key);

	public int size() {

		return sizeHelper(root);
	}
	
	private int sizeHelper(TreeNode root) {
		if (root == null)
			return 0;
		else
			return sizeHelper(root.getLeft()) + 1 + sizeHelper(root.getRight());
	}
	
	
//	private TreeNode add(Comparable val, TreeNode tree){
//		if(tree == null)
//			tree = new TreeNode(val, null,  null);
//		else if (val.compareTo(tree.getValue())<0)
//			tree.setLeft(add(val, tree.getLeft()));
//		else if (val.compareTo(tree.getValue())>0)
//			tree.setRight(add(val, tree.getRight()));
//		return tree;
//	}
}
