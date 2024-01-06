package org.example;

import java.util.HashSet;

public class LinkedListFour {
    private Node head;
    private int length;

    public LinkedListFour(int value) {
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

    public void removeDuplicates() {
        //11223334
        if (length == 0) return;
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            int value = current.value;
            if (set.contains(value)) {
                prev.next = current.next;
            } else {
                set.add(value);
                prev = current;
            }
            current = current.next;
        }
    }

    public int binaryToDecimal() {
        if (getLength() == 0) return 0;
        var current = head;
        var result = 0.0;
        var potency = getLength() - 1;
        while (current != null) {
            int value = current.value;
            result += value * Math.pow(2, potency);
            current = current.next;
            potency--;
        }
        return (int) result;
    }

    public void reverseBetween(int m, int n) {
        // Your implementation here
    }
}
