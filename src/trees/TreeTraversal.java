package trees;

/**
 * Tree Traversals
 * 
 * Inorder left, root , right : so first element of the traversal array is
 * always the leftmost leaf of the tree OR else the root.
 * 
 * Preorder root, left, right : so first element of the traversal array is
 * always the root node of the tree
 * 
 * Postorder left, right , root :so first element of the traversal array is
 * always the leftmost leaf node of the tree OR rightmost leaf OR root last is
 * always the root node of the tree (yes) Breadth first (level order)
 * 
 * Depth first - Preorder/inorder/postorder
 * 
 * @author kjdet
 */

public class TreeTraversal {

	/***
	 * 14 12 15 11 13 16
	 */
	public void printInOrderTraverse(TreeNode root) {
		// left root right
		if (root != null) {
			printInOrderTraverse(root.left);
			System.out.print(root.value + "\t");
			printInOrderTraverse(root.right);
		}
	}

	public void printPreOrderTraverse(TreeNode root) {
		if (root != null) {
			System.out.print(root.value + "\t");
			printPreOrderTraverse(root.left);
			printPreOrderTraverse(root.right);
		}
	}

	public void printPostOrderTraverse(TreeNode root) {
		if (root != null) {
			printPostOrderTraverse(root.left);
			printPostOrderTraverse(root.right);
			System.out.print(root.value + "\t");
		}
	}

	public void printLevelOrderTraverse(TreeNode root) {

	}
}
