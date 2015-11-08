package trees;

public class TreeNode {
	int value;
	TreeNode right;
	TreeNode left;

	public TreeNode() {
		this.right = null;
		this.left = null;
	}

	public TreeNode(int value) {
		this.value = value;
		this.right = null;
		this.left = null;
	}

	public TreeNode(int value, TreeNode leftChild, TreeNode rightChild) {
		this.value = value;
		this.left = leftChild;
		this.right = rightChild;
	}
}
