package com.google.chaptertwo;

//ctci - Page 93. q 2.3 - Delete middle node from a linked list. Not exactly the middle node but any node except the first and last node. 
// Given that you have only access to that node.

public class DeleteMiddleNode {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void deleteMiddleNode(Node n) {
		n.data = n.next.data;
		n.next = n.next.next;

	}

	void printList(Node n) {

		n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;

		}
	}

	public static void main(String[] args) {

		DeleteMiddleNode list = new DeleteMiddleNode();
		list.head = new Node(12);
		Node second = new Node(11);
		Node third = new Node(15);
		Node fourth = new Node(17);
		Node fifth = new Node(41);
		Node sixth = new Node(43);
		Node seventh = new Node(26);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;

		System.out.println("Orignal List - ");
		list.printList(head);

		System.out.println("Middle list - ");
		list.deleteMiddleNode(third);
		list.printList(head);

	}

}
