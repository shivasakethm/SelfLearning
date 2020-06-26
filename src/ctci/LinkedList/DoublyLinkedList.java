package ctci.LinkedList;


class DLinkedList {
    DNode head;

    void insert(int value) {
        DNode traverse = head;
        DNode newNode = new DNode(value);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            newNode.prev = null;
            return;
        }
        while (traverse.next != null) {
            traverse = traverse.next;
        }
        traverse.next = newNode;
        newNode.prev = traverse;

    }

    void print() {
        DNode dNode = head;
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        while (dNode != null) {
            System.out.print(dNode.value + "->");
            dNode = dNode.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    void printReverse() {
        DNode dNode = head;
        while (dNode.next != null) {
            dNode = dNode.next;
        }
        while (dNode != null) {
            System.out.print(dNode.value + "->");
            dNode = dNode.prev;
        }
        System.out.print("Null");
        System.out.println();
    }

    void reverseDL() {
//        DNode prev = null;
//        DNode trav = head;
//        DNode curr = head;

//        if (head == null){
//            return;
//        }
//        while (curr!= null){
//            curr = curr.next;
//            trav.next = prev;
//            trav.prev = curr;
//            prev = trav;
//            trav = curr;
//        }
//        prev.prev = null;
//        head = prev;


//    Another solution using two nodes.
        DNode temp = null;
        DNode curr = head;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }

        if (temp != null) {
            System.out.println(temp.prev.value);
            head = temp.prev;
        }
    }

    static class DNode {
        DNode prev;
        DNode next;
        int value;

        DNode(int value) {
            this.value = value;
        }
    }
}

public class DoublyLinkedList {

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(9);
        list.insert(6);
        list.insert(7);
        list.print();
//        list.printReverse();
        list.reverseDL();
        list.print();
    }
}
