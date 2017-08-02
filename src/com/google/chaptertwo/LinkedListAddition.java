// Reference - http://www.geeksforgeeks.org/add-two-numbers-represented-by-linked-lists/
// Page 95 q 2.5 - To add two LL.

package com.google.chaptertwo;

public class LinkedListAddition {

	static Node head1, head2;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static Node printLists(Node list1, Node list2) {

		int carry = 0, sum = 0;
		Node temp = null;
		Node prev = null;
		Node res = null;

		while (list1 != null || list2 != null) {
			sum = (list1.data + list2.data) + carry;

			if (sum >= 10)
				carry = sum / 10;
			else
				carry = 0;

			sum = sum % 10;
			temp = new Node(sum);

			if (res == null)
				res = temp;
			else
				prev.next = temp;

			prev = temp;

			list1 = list1.next;
			list2 = list2.next;

		}
		if (carry > 0) {
			temp.next = new Node(carry);
		}
		return res;

	}

	static void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	public static void main(String[] args) {

		LinkedListAddition list1 = new LinkedListAddition();
		list1.head1 = new Node(7);
		Node second = new Node(1);
		Node third = new Node(6);
		list1.head1.next = second;
		second.next = third;

		LinkedListAddition list2 = new LinkedListAddition();
		list2.head2 = new Node(5);
		Node fourth = new Node(3);
		Node fifth = new Node(4);
		list2.head2.next = fourth;
		fourth.next = fifth;

		System.out.println("List 1 ");
		printList(head1);

		System.out.println("List 1 ");
		printList(head2);

		System.out.println("Sum of two linked lists - ");

		Node rs = printLists(head1, head2);
		printList(rs);
	}

}
