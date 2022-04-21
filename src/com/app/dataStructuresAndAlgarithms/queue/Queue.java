package com.app.dataStructuresAndAlgarithms.queue;

import java.util.NoSuchElementException;

public class Queue {
	private ListNode front;
	private ListNode rear;
	private int Length;

	private class ListNode {
		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public Queue() {
		this.front = null;
		this.rear = null;
		this.Length = 0;
	}

	public int length() {
		return Length;
	}

	public boolean isEmty() {
		return Length == 0;
	}

	public void enqueue(int data) {
		ListNode newNode = new ListNode(data);
		if (isEmty()) {
			front = newNode;
		} else {
			rear.next = newNode;
		}
		rear = newNode;
		Length++;
	}

	public int dequeue() {
		int result = 0;
		if (isEmty()) {
			throw new NoSuchElementException("Queue is already empty");
		} else {
			result = front.data;
			front = front.next;
			if (front == null) {
				rear = null;
			}
		}
		return result;
	}
	
	public void displayQueue() {
		ListNode temp=front;
		if(isEmty()) {
			throw new NoSuchElementException("Queue is already empty");
		}else {
			while(temp != null) {
				System.out.print(temp.data+" -->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		
		queue.displayQueue();
		
		queue.dequeue();
		queue.dequeue();
		
		queue.displayQueue();
	}

}
