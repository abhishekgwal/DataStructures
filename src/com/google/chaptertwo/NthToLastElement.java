package com.google.chaptertwo;

// q 2.2 return nth to last element - Page 94
//https://www.youtube.com/watch?v=i7v1UWlaYrI&t=414s

public class NthToLastElement {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	void nthToLast(int n) {
		Node current = head, follower = null;
		follower = current;
		
		for(int i = 0; i < n; i++) {
				if (current == null) System.out.println("Null");;
			current = current.next;
		}
		while (current.next != null) {
			follower = follower.next;
			current = current.next;
		}
		System.out.println(follower.data);
	}

	public static void main(String[] args) {

		NthToLastElement list = new NthToLastElement();
		list.head = new Node(12);
		Node second = new Node(11);
		Node third = new Node(12);
		Node fourth = new Node(21);
		Node fifth = new Node(41);
		Node sixth = new Node(43);
		Node seventh = new Node(21);

		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		
		list.nthToLast(4);

	}

}
