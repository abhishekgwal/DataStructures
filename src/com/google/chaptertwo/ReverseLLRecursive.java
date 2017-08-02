package com.google.chaptertwo;

public class ReverseLLRecursive {
	
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}
	}
	
	void reverseRecursion(Node p) {
		if (p.next == null) {
			head = p;
			return;
		}
		reverseRecursion(p.next);
		Node q = p.next;
		q.next = p;
		p.next = null;
	}
	
	void printList(Node node) {

		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public static void main(String[] args) {
		
		ReverseLLRecursive list = new ReverseLLRecursive();

		list.head = new Node(2);
		Node second = new Node(4);
		Node third = new Node(6);
		Node fourth = new Node(5);
		Node fifth = new Node(1);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		System.out.println("Given List - ");
		list.printList(head);
		
		System.out.println("Reverse List - ");
		list.reverseRecursion(head);
		list.printList(head);

	}

}
