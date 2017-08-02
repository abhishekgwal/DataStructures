package com.google.chapterthree;

// Pg 98 Q3.2 ctci

public class MinStack {
	
	static int top = -1;
	static int stop = 0;
	int mainstack[] = new int[100];
	int minstack[] = new int[100];
	
	void push(int x) {
		top = top + 1;
		mainstack[top] = x;
		
		if (top == 0)
			minstack[stop] = x;
		else if (peekMainStack() <= peekMinStack())
		{
			minstack [++stop] = x;
		}
	}
	
	public int peekMainStack() {
		return mainstack[top];
	}
	
	public int peekMinStack() {
		return minstack[stop];
	}
	
	public int min() {
		return minstack[stop];
	}
	
	void pop () {
		if (peekMainStack() == peekMinStack()) {
			mainstack[top] = 0;
			top = top - 1;
			minstack[stop] = 0;
			stop = stop - 1;
		}
		else {
			mainstack[top] = 0;
			top = top - 1;
		}
	}
	
	public static void main(String[] args) {
		
		MinStack obj1 = new MinStack();
		obj1.push(50);
		obj1.push(40);
		obj1.push(35);
		obj1.push(55);
		obj1.push(37);
		System.out.println("Minimum Element in stack "+ obj1.min());
		obj1.push(20);
		System.out.println("Minimum Element in stack "+ obj1.min());
		obj1.pop();
		obj1.pop();
		obj1.push(60);
		obj1.pop();
		obj1.push(10);
		System.out.println("Minimum Element in stack "+ obj1.min());
	}

}
