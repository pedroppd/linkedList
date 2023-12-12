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
        System.out.println("####################### PREPREND ############################");
        LinkedList myLinkedList2 = new LinkedList(2);
        myLinkedList2.append(3);
        myLinkedList2.preprend(1);
        myLinkedList2.printList();

        System.out.println("####################### REMOVE FIRST ############################");
        LinkedList myLinkedList3 = new LinkedList(2);
        myLinkedList3.append(3);
        myLinkedList3.append(4);
        myLinkedList3.append(5);
        myLinkedList3.append(6);
        System.out.println(myLinkedList3.removeFirst().value);
        System.out.println(myLinkedList3.get(2));
        myLinkedList3.printList();

        System.out.println("####################### SET ############################");
        LinkedList myLinkedList4 = new LinkedList(2);
        myLinkedList4.append(3);
        myLinkedList4.append(4);
        myLinkedList4.append(5);
        myLinkedList4.append(6);
        System.out.println(myLinkedList4.set(3, 356));
        myLinkedList4.printList();


        System.out.println("####################### INSERT ############################");
        LinkedList myLinkedList5 = new LinkedList(2);
        myLinkedList5.append(3);
        myLinkedList5.append(4);
        myLinkedList5.append(5);
        myLinkedList5.append(6);
        System.out.println(myLinkedList4.insert(2, 1000));
        myLinkedList4.printList();

        System.out.println("####################### Remove ############################");
        LinkedList myLinkedList6 = new LinkedList(2);
        myLinkedList6.append(3);
        myLinkedList6.append(4);
        myLinkedList6.append(5);
        myLinkedList6.append(6);
        System.out.println(myLinkedList6.remove(2));
        myLinkedList6.printList();
    }
}