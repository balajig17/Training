package ds.problem;

import ds.tree.BST;
import ds.tree.BST.Traversal;

public class TreeProblems {

	public static void main(String[] args) {
		
		BST tree = new BST();
		
		tree.insert(4);
		tree.insert(6);
		tree.insert(5);
		LargestNodeValue(tree);
		
		
	}
	
	public static void LargestNodeValue(BST tree) {
		tree.traversal(Traversal.INORDER);
		System.out.println("Largest = "+tree.getLargestValue());
		System.out.println("Second Largest = "+tree.getSecondLargestValue());
	}
	
	
	public static void isSuperBalanced(BST tree) {
		
	}

}
