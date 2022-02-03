package com.app.dataStructuresAndAlgarithms.singly_linked_list;

public class InsertLast {



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
		InsertLast sll=new InsertLast();
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
		
	//	sll.insertLast(77);
		//sll.create();
		sll.getNthNodeFromEnd(1);
		

	}
	void getNthNodeFromEnd(int n) {
		ListNode mainPtr=head;
		ListNode refPtr=head;
		int count=0;
		while(count<n) {
			refPtr=refPtr.next;
			count++;
		}
		while(refPtr != null) {
			mainPtr=mainPtr.next;
			refPtr=refPtr.next;
			
		}
		System.out.println(mainPtr.data+"-->"+mainPtr.next);
	}
	
	public void insertLast(int value) {
		  ListNode newNode=new ListNode(value);
		  newNode.next=head;
		  head=newNode;
	}
	void middle() {
		if(head==null) {
			System.out.println("there is no list");
		}
		ListNode fastPtr=head;
		ListNode slowPtr=head;
		while(fastPtr != null && fastPtr.next != null) {
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
					
		}
		System.out.println(slowPtr.data);
	}
	
	public int create() {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.println("null");
 		return 1;
	}
	


}
