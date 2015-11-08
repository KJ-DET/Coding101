package trees;

public class Tree {
	TreeNode root;
	int treeSize = 0;

	public Tree() {
		this.root = null;
	}

	public Tree(TreeNode root) {
		this.root = root;
	}

	public void addChildren(TreeNode leftchild, TreeNode rightchild) {
		this.root.left = leftchild;
		this.root.right = rightchild;
	}

	public int treeSize() {
		this.treeSize = 0;
		countInOrder(this.root);
		return this.treeSize;
	}

	private void countInOrder(TreeNode root) {
		if (root != null) {
			this.treeSize++;
			countInOrder(root.left);
			countInOrder(root.right);
		}

	}

	/*
	 * public Tree(int value) { this.r }
	 */
	// Assuming it is like treeNode(value,null,null)
	public void addNode(TreeNode treeNode) {
		TreeNode parent = this.root;
		TreeNode previous = null;
		boolean appended = false;
		while (parent != null) {
			previous = parent;
			if (parent.value > treeNode.value) {
				parent = parent.left;
			} else if (parent.value < treeNode.value) {
				parent = parent.right;
			} else if (parent.value == treeNode.value) {
				treeNode.left = parent.left;
				parent.left = treeNode.left;
				appended = true;
				break;
			}

		}
		if (!appended) {
			if (previous.value < treeNode.value) {
				previous.right = treeNode;
			} else {
				previous.left = treeNode;
			}

		}
	}

	public void contructBinaryTree() {

	}

	public void makeMyTree() {
		this.root = new TreeNode(14);
		TreeNode leftChild = new TreeNode(12, new TreeNode(11),
				new TreeNode(13));
		TreeNode rightChild = new TreeNode(15, null, new TreeNode(16));
		this.addChildren(leftChild, rightChild);
	}

}
