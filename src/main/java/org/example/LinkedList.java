package org.example;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        this.length++;
    }

    public Node removeLast() {
        Node temp = head;
        if (length == 0) return null;
        while (temp != null) {
            if (temp.value == this.length) {
                temp.next = null;
                temp.value = 0;
            }

            if (temp.value == this.length - 1) {
                temp.next = null;
                this.tail.value = temp.value;
                this.length--;
            }

            temp = temp.next;
        }
        return new Node(this.length);
    }

}
