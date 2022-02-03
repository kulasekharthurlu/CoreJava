package com.app.dataStructuresAndAlgarithms;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void displayList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int length() {
        if (head == null)
            return 0;
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insert(int position, int value) {
        ListNode node = new ListNode(value);
        if (position == 0) {
            node.next = head;
            head = node;

        } else {
            ListNode previous = head;
            int count = 0;// position-1
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        // list.head = new ListNode(1);
        // ListNode second = new ListNode(2);
        // ListNode third = new ListNode(3);
        // ListNode fourth = new ListNode(4);

        // list.head.next = second;
        // second.next = third;
        // third.next = fourth;

        // list.displayList();
        // System.out.println("length of list is: " + list.length());

        // list.insertFirst(23);
        // list.insertFirst(12);
        // list.insertFirst(3);
        // list.insertFirst(4);

        // list.insertLast(243);
        // list.insertLast(512);
        // list.insertLast(356);

        list.insert(0, 23);
        list.insert(1, 12);
        list.insert(2, 3);
        list.insert(3, 49);
        list.insert(2, 488);
        list.insert(3, 567);

        list.displayList();

    }
}
