package com.google.chapterthree;

//https://www.youtube.com/watch?v=nll-b4GeiX4

import java.util.Stack;

public class SortStack {

	

	public Stack<Integer> sortStack(Stack<Integer> stack) {
		if (stack.isEmpty())
			return stack;
		int temp = 0;
		
		Stack<Integer> newstack = new Stack<>();
		newstack.push(stack.pop());
		
			while (!stack.isEmpty()) {
				temp = stack.pop();
				while (!newstack.isEmpty() && temp > newstack.peek()) {
					stack.push(newstack.pop());
				}
				newstack.push(temp);
			}
			return newstack;
		}
		

	public static void main(String[] args) {
			
		SortStack obj = new SortStack();
		
			Stack<Integer> stack = new Stack<>();
			stack.add(2);
			stack.add(6);
			stack.add(10);
			stack.add(5);
			stack.add(15);
			System.out.println("Orignal Stack "+stack);
			
			System.out.println("Sorted Stack "+obj.sortStack(stack));
			
			
			
			
	}

}
