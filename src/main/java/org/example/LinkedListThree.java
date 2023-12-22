package org.example;

public class LinkedListThree {

    private Node head;
    private int length;

    public LinkedListThree(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x) {
        if (head == null) return;

        Node dummyLess = new Node(0);// Dummy node for values less than x
        Node lessPtr = dummyLess; // Pointer for values less than x

        Node dummyGreaterEqual = new Node(0);  // Pointer for values greater than or equal to x
        Node greaterEqualPtr = dummyGreaterEqual; // Dummy node for values greater than or equal to x
        Node current = head;  // Start traversing from the head of the linked list

        while (current != null) {
            if (current.value < x) {
                // Values less than x go in the lessPtr chain
                lessPtr.next = current;
                lessPtr = lessPtr.next;
            } else {
                // Values greater than or equal to x go in the greaterEqualPtr chain
                greaterEqualPtr.next = current;
                greaterEqualPtr = greaterEqualPtr.next;
            }
            current = current.next;
        }
        // Connect the two chains
        greaterEqualPtr.next = null; // Terminate the greaterEqual chain
        lessPtr.next = dummyGreaterEqual.next; // Connect the two chains

        // Update the head to the rearranged list
        head = dummyLess.next;
    }
}

