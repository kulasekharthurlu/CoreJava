package com.app.dataStructuresAndAlgarithms.DoublyLinkedList;

public class CreateDLL {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {

        private int data;
        private ListNode next;
        private ListNode prev;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CreateDLL() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int size() {
        return length;
    }

    public void createDoublyLinkedList() {
        ListNode first = new ListNode(10);
        ListNode second = new ListNode(21);
        ListNode third = new ListNode(78);
        ListNode fourth = new ListNode(91);
        ListNode fifth = new ListNode(12);
        ListNode sixth = new ListNode(90);

        this.head = first;
        this.head.next = second;
        this.head.prev = null;
        second.next = third;
        second.prev = first;
        third.next = fourth;
        third.prev = second;
        fourth.next = fifth;
        fourth.prev = third;
        fifth.next = sixth;
        fifth.prev = fourth;
        sixth.next = null;
        sixth.prev = fifth;
        this.tail = sixth;
        this.length = 6;
    }

    public void displyForward() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void displyBackward() {
        ListNode current = tail;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.prev;
        }
        System.out.println("null");
    }

    public void insertAtHead(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public void insertAtTail(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
   public void insertAtPosition(int data, int position) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            if (position == 0) {
                insertAtHead(data);
            } else if (position == length) {
                insertAtTail(data);
            } else {
                ListNode current = head;
                int count = 0;
                while (count < position - 1) {
                    current = current.next;
                    count++;
                }
                newNode.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
                newNode.prev = current;
            }
        }
        length++;
    }
    public static void main(String[] args) {
        CreateDLL dll = new CreateDLL();
        dll.createDoublyLinkedList();

        // dll.displyBackward();
        dll.insertAtHead(100);
        dll.displyForward();

    }
}
