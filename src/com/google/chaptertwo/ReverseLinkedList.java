package com.google.chaptertwo;

//Reversing a linked list using Iterative Method

public class ReverseLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}

	void reverse() {
		Node current, prev, next;
		current = head;
		prev = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;

	}

	void printList(Node node) {

		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}

	}

	public static void main(String[] args) {

		ReverseLinkedList list = new ReverseLinkedList();

		list.head = new Node(2);
		Node second = new Node(4);
		Node third = new Node(6);
		Node fourth = new Node(5);
		Node fifth = new Node(1);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		System.out.print("Given List - ");
		list.printList(head);
		System.out.println();
		
		System.out.print("Reverse List - ");
		list.reverse();
		list.printList(head);

	}
}