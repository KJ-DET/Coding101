package trees;

public class TreesMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tree1 = new Tree(); // empty tree

		tree1.makeMyTree(); // create basic tree with some hard-coded data
		TreeTraversal treeTraversal = new TreeTraversal();

		System.out.println("InOrder Traversal is:: ");
		treeTraversal.printInOrderTraverse(tree1.root);

		System.out.println("\nPreOrder Traversal is:: ");
		treeTraversal.printPreOrderTraverse(tree1.root);

		System.out.println("\nPostOrder Traversal is:: ");
		treeTraversal.printPostOrderTraverse(tree1.root);

		System.out.println("\n Number of nodes in the tree = "
				+ tree1.treeSize());
	}
}
