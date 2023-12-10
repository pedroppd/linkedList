package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        // (2) Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);

        // (1) Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);

        // (0) Items - Returns null
        System.out.println(myLinkedList.removeLast());

        LinkedList myLinkedList2 = new LinkedList(2);
        myLinkedList2.append(3);
        myLinkedList2.preprend(1);
        myLinkedList2.printList();
    }
}