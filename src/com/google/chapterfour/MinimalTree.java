package com.google.chapterfour;

// Question 4.2 - Minimal Tree. To create a BS tree from an array. Array which is sorted and contains unique elements.
//https://www.youtube.com/watch?v=VCTP81Ij-EM&t=35s
class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		data = x;
	}
}

public class MinimalTree {

	void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
	}

	TreeNode minimalTree(int array[]) {
		return minimalTree(array, 0, array.length - 1);
	}

	TreeNode minimalTree(int arr[], int start, int end) {
		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = minimalTree(arr, start, mid - 1);
		node.right = minimalTree(arr, mid + 1, end);
		return node;
	}

	public static void main(String[] args) {

		int a[] = { 5, 8, 13, 16, 19, 22, 25, 76 };

		TreeNode root = null;
		MinimalTree obj = new MinimalTree();
		root = obj.minimalTree(a);
		obj.inOrder(root);

	}

}
