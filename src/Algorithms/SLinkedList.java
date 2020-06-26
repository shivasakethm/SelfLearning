package Algorithms;


public class SLinkedList {

    Node head;

    public static SLinkedList insert(SLinkedList list, int data) {
        System.out.println("Inserting " + data + " at the End");

        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }

        printList(list);
        return list;
    }

    public static SLinkedList beginning(SLinkedList list, int data) {
        System.out.println("Inserting " + data + " at the beginning");

        Node newNode = new Node(data);
        if (list.head == null) {
            System.out.println("in else");
            list.head = newNode;
        } else {
            Node traverse = list.head;
            list.head = newNode;
            newNode.next = traverse;
        }
        printList(list);
        return list;
    }

    public static void printList(SLinkedList list) {
        System.out.println("Printing List");
        Node traverse = list.head;
        if (traverse == null) {
            System.out.println("Empty List");
        }
        while (traverse != null) {
            System.out.print(traverse.data + "->");
            traverse = traverse.next;
        }
        System.out.println();
    }

    public static void toRightNode(SLinkedList list, int leftNodeData, int data) {
        System.out.println("Inserting " + data + " to the right of " + leftNodeData);
        Node rightNode = new Node(data);
        Node traverse = list.head;
        while (traverse.data != leftNodeData) {
            traverse = traverse.next;
        }
        rightNode.next = traverse.next;
        traverse.next = rightNode;
        printList(list);

    }

    public static void removeNode(SLinkedList list, int data) {
        System.out.println("Removing " + data + " from list");
        Node traverse = list.head;
        Node previous = null;
        if (traverse == null) {
            System.out.println("LinkedList is empty");
        }
//        else if(traverse.next == null){
//            System.out.println("There is only one element");
//            if(traverse.data == data){
//                list.head = null;
//            }
//        }
        else if (traverse.data == data) {
            list.head = traverse.next;
        } else {
            while (traverse.data != data) {
                previous = traverse;
                traverse = traverse.next;
            }
            previous.next = traverse.next;
        }
        printList(list);
    }

    public static void main(String[] args) {
        SLinkedList sLinkedList = new SLinkedList();
        SLinkedList sLinkedList1 = new SLinkedList();
        sLinkedList = insert(sLinkedList, 3);
        sLinkedList = insert(sLinkedList, 4);
        sLinkedList = beginning(sLinkedList, 2);
        toRightNode(sLinkedList, 3, 5);
        toRightNode(sLinkedList, 4, 5);
        removeNode(sLinkedList, 5);
        System.out.println("End of List 1");
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}


