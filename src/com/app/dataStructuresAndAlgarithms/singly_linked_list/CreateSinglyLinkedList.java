package com.app.dataStructuresAndAlgarithms.singly_linked_list;

public class CreateSinglyLinkedList {

private	ListNode head;
	
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public static void main(String[] args) {
		CreateSinglyLinkedList sll=new CreateSinglyLinkedList();
		 ListNode  first=new ListNode(10);
		ListNode second=new ListNode(21);
		ListNode third=new ListNode(78);
		ListNode fourth=new ListNode(91);
		ListNode fifth=new ListNode(12);
		ListNode sixth=new ListNode(90);
		
		sll.head =first;
		sll.head.next = second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sll.display(reverseList(sll.head));

	}
	
	public static ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) {
			return head;
		}
		ListNode p=reverseList(head.next);
		head.next.next=head;
		head.next=null;
		return p;
	}
	public void display(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
 		return;
	}
	
}
