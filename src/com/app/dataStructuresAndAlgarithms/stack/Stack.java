package com.app.dataStructuresAndAlgarithms.stack;

public class Stack {

	private ListNode top;
	private int length;

	public Stack() {
		this.length = 0;
		this.top = null;
	}

	private class ListNode {
		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.data = data;
		}

	}

	public int length() {
		return length;
	}

	public boolean isEmty() {
		return length == 0;
	}

	public void push(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = top;
		top = newNode;
		length++;

	}

	public int pop() throws Exception {
		if (isEmty()) {
			throw new Exception();
		}
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}

	public int peek() throws Exception {
		if (isEmty()) {
			throw new Exception();
		}

		int peekValue = top.data;
		return peekValue;
	}

	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push(12);
		stk.push(23);
		stk.push(34);
		stk.push(56);
		stk.push(1);

		try {
			System.out.println(stk.pop());
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		try {
			System.out.println(stk.peek());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
