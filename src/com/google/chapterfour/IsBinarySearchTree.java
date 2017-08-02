package com.google.chapterfour;

//https://www.youtube.com/watch?v=aNtDir94pcA
// Q 4.5 Validate if a given binary tree is a BST or not


class BTNode {
	int data;
	BTNode left;
	BTNode right;

	BTNode(int val) {
		data = val;
	}
}

public class IsBinarySearchTree {

	boolean isBST(BTNode root, int min, int max) {
		if (root == null) {
			return true;
		}

		if (root.data > min && root.data < max) {

			boolean leftBST = isBST(root.left, min, root.data);
			boolean rightBST = isBST(root.right, root.data, max);
			return leftBST && rightBST;
		} else
			return false;

	}

	public static void main(String[] args) {
		
		IsBinarySearchTree obj = new IsBinarySearchTree();
		BTNode node = new BTNode(4);
		node.left = new BTNode(2);
		node.right = new BTNode(6);
		node.left.left = new BTNode(1);
		node.left.right = new BTNode(3);
		node.right.left = new BTNode(5);
		node.right.right = new BTNode(7);
		boolean b = obj.isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(b);

	}

}

