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
        myLinkedList2.prepend(1);
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

        System.out.println("####################### reverse ############################");
        LinkedList myLinkedList7 = new LinkedList(2);
        myLinkedList7.append(3);
        myLinkedList7.append(4);
        myLinkedList7.append(5);
        myLinkedList7.append(6);
        myLinkedList7.printList();
        myLinkedList7.reverse();
        myLinkedList7.printList();


        LinkedListTwo mylist = new LinkedListTwo(1);
        mylist.append(2);
        mylist.append(3);
        mylist.append(4);
        mylist.append(5);
        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        System.out.println( "Middle Node: "+ mylist.findMiddleNode().value);
        mylist.append(6);
        System.out.println("===========================");
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        System.out.println( "Middle Node: "+ mylist.findMiddleNode().value);

        LinkedListTwo myLinkedListKth = new LinkedListTwo(1);
        myLinkedListKth.append(2);
        myLinkedListKth.append(3);
        myLinkedListKth.append(4);
        myLinkedListKth.append(5);

        int k = 2;
        int result = myLinkedListKth.findKthFromEnd(k).value;

        System.out.println("findMiddleNode should be 4 and the output value is:" + result); // Output: 4

        // Create a new LinkedList and append values to it
        LinkedListThree ll = new LinkedListThree(3);
        ll.append(5);
        ll.append(8);
        ll.append(10);
        ll.append(2);
        ll.append(1);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        ll.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        ll.partitionList(5);

        // Print the list after partitioning
        System.out.println("LL after partitionList:");
        ll.printList(); // Output: 3 2 1 5 8 10
        System.out.println("############### removeDuplicates ######################");
        LinkedListFour myLinkedListFour = new LinkedListFour(1);
        myLinkedListFour.append(1);
        myLinkedListFour.append(2);
        myLinkedListFour.append(2);
        myLinkedListFour.append(3);
        myLinkedListFour.append(3);
        myLinkedListFour.append(3);
        myLinkedListFour.append(4);

        myLinkedListFour.removeDuplicates();

        myLinkedListFour.printList();

        System.out.println("################################ binaryToDecimal #################################");
        // ---------------
        // Convert 1011 to 11
        // ---------------
        LinkedListFour list1 = new LinkedListFour(1);
        list1.append(1);
        list1.append(1);
        list1.append(1);
        System.out.println("Convert 1111 to 50:");
        System.out.println("Input: 1 -> 1 -> 1 -> 1");
        System.out.println("Output: " + list1.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert 1100 to 12
        // ---------------
        LinkedListFour list2 = new LinkedListFour(1);
        list2.append(1);
        list2.append(0);
        list2.append(0);
        System.out.println("Convert 1100 to 12:");
        System.out.println("Input: 1 -> 1 -> 0 -> 0");
        System.out.println("Output: " + list2.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert 1 to 1
        // ---------------
        LinkedListFour list3 = new LinkedListFour(1);
        System.out.println("Convert 1 to 1:");
        System.out.println("Input: 1");
        System.out.println("Output: " + list3.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert empty list to 0
        // ---------------
        LinkedListFour list4 = new LinkedListFour(0);
        list4.makeEmpty();
        System.out.println("Convert empty list to 0:");
        System.out.println("Input: empty");
        System.out.println("Output: " + list4.binaryToDecimal());
        System.out.println("---------------");

    }
}