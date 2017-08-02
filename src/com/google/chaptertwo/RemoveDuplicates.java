package com.google.chaptertwo;

public class RemoveDuplicates {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void removeDups() {
		
		Node ptr1 = null, ptr2 = null, dup = null;
		ptr1 = head;
		while(ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			while(ptr2.next != null) {
				if(ptr1.data == ptr2.next.data) {
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
				}
				else ptr2 =ptr2.next;
				}
			ptr1 = ptr1.next;
			}
		}

	void printList(Node n) {

		n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	public static void main(String[] args) {

		RemoveDuplicates list = new RemoveDuplicates();
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

		System.out.println("Orignal List - ");
		list.printList(head);

		System.out.println("No Duplicate List - ");
		list.removeDups();
		list.printList(head);
	}

}
