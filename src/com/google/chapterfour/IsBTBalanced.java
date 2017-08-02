package com.google.chapterfour;

//For all nodes of the tree, the absolute value b/w the heights of lst and rst should not be greater than 1. 

public class IsBTBalanced {

	static Node root;
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data) {
			this.data = data;
		}
	}
	
	int isBTBalanced(Node root) {
		if (root == null)
			return -1;
		int lst = isBTBalanced(root.left);
		int rst = isBTBalanced(root.right);
		
		if(Math.abs(lst - rst) > 1)
			return -1;
		return Math.max(lst, rst) + 1;
	}
	
	public static void main(String[] args) {

		IsBTBalanced tree = new IsBTBalanced();
		tree.root= new Node(3);
		tree.root.left = new Node(1);
		tree.root.left.left = new Node(0);
		tree.root.right = new Node(5);
		tree.root.right.left = new Node(4);
		//tree.root.right.left.right = new Node(6);
		
		int res = tree.isBTBalanced(root);
		System.out.println(res);
	}

}
