package org.example;

public class LinkedListTwo {

    private Node head;
    private Node tail;

    public LinkedListTwo(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findMiddleNode() {
        // 1,2,3,4,5,6,7
        Node slow = head;
        Node fast = head;

        // fast -> 3 -> 5 -> 7 -> null
        // slow -> 2 -> 3 -> 4 ->
        while ((slow != null && slow.next != null) && (fast != null && fast.next != null)) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while ((slow != null && slow.next != null) && (fast != null && fast.next != null)) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }

    public Node findKthFromEnd(int k) {
        if (head == null || k <= 0) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        // Move fast pointer k nodes ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null; // If k is greater than the number of nodes
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}

