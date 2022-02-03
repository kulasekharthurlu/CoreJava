package com.app.dataStructuresAndAlgarithms.singly_linked_list;

public class DeleteFirstNode {

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
		DeleteFirstNode sll=new DeleteFirstNode();
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
		
		sll.deleteFistNode();
		sll.create();
		

	}
	
	public ListNode deleteFistNode() {
		 if(head==null) {
			 return null;
		 }
		 ListNode temp=head;
		 head=head.next;
		 temp.next =null;
		 return temp;
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
