package com.google.chaptertwo;

public class LinkedListPOJO {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}

	void printList(Node node) {

		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

}
