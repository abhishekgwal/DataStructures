package com.google.chapterthree;

// Q 3.4 - ctci - Page 236 - Implement a queue using two stacks

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void push(int value) {
        s1.push(value);
    }

    public int pop() {
        if (s2.isEmpty()) {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    
    public static void main(String[] args) {
    	
    	StackQueue stack = new StackQueue();
    
    	stack.push(1);
    	stack.push(2);
    	System.out.println(stack.pop()); //  1
    	stack.push(3);
    	stack.push(4);
    	    	
    	System.out.println(stack.pop());
    	
	}
}
