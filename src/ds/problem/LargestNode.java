package ds.problem;

import ds.tree.BST;
import ds.tree.BST.Traversal;

public class LargestNode {

	public static void main(String[] args) {
		
		BST tree = new BST();
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.traversal(Traversal.INORDER);
		
	}

}
