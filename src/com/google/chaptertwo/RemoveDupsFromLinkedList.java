package com.google.chaptertwo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupsFromLinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode (int val) {
            this.val = val;
        }
    }

    ListNode removeDups (ListNode node) {

        ListNode temp = null;
        ListNode head = null;

        Set<Integer> set = new HashSet<>();
        while(node != null) {
            set.add(node.val);
            node = node.next;
        }
        for (Integer i : set) {
            if (head == null) {
                head = new ListNode(i);
                temp = head;
            }
            else {
                ListNode nd = new ListNode(i);
                temp.next = nd;
                temp = nd;
            }
        }
        return head;
    }

    static void printNodes (ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        RemoveDupsFromLinkedList obj = new RemoveDupsFromLinkedList();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode sol = obj.removeDups(head);
        printNodes(sol);
    }

}
