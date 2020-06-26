package ctci.LinkedList;

import java.util.HashSet;

class LinkedListImp {

    Node head;

    void insert(LinkedListImp list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node node = list.head;
        if (list.head == null) {
            list.head = newNode;
        } else {
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    void print(LinkedListImp listImp) {
        Node node = listImp.head;
        if (listImp.head == null) {
            System.out.println("Empty LinkedList");
        } else {
            while (node.next != null) {
                System.out.print(node.value);
                System.out.print("->");
                node = node.next;
            }
            System.out.println(node.value + "->");
        }
        System.out.println();
    }

    void delete(LinkedListImp listImp, int data) {
        Node node = listImp.head;
        Node prevNode = null;
        if (node == null) {
            System.out.println("No elements to remove");
        } else if (node.value == data) {
            listImp.head = node.next;
        } else {
            while ((node.value != data)) {
                prevNode = node;
                node = node.next;
            }
            prevNode.next = node.next;
        }
    }

    int length(LinkedListImp listImp) {
        int count = 0;
        Node node = listImp.head;
        if (node == null) {
            return 0;
        } else {
            while (node != null) {
                count++;
                node = node.next;
            }
        }
        return count;
    }

    int printKthToLast(LinkedListImp listImp, int k) {
        Node node = listImp.head;
        int length = length(listImp);
        int index = 1;
        if (head == null) {
            return 0;
        }
        while (node.next != null) {
            if (k == index) {
                System.out.println("kth element is " + node.value);
            }
            node = node.next;
            index++;
        }
        return index;

    }

    int recursion(LinkedListImp listImp, int k) {
        System.out.println(listImp.head.value);
        if (listImp.head.next == null) {
            return 0;
        }
        Node node = listImp.head;
        listImp.head = listImp.head.next;
        int index = recursion(listImp, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + node.value);
            System.out.println(index);
        }
        return index;
    }

    void middle(LinkedListImp listImp) {
        Node first = head;
        Node second = head;
        if (head != null) {
            while (second != null && second.next != null) {
                first = first.next;
                second = second.next.next;
            }
            System.out.println(first.value);
        }

    }

    boolean palindrome() {
        Node last = head;
        if (head != null) {
            while (last.next != null) {
                last = last.next;
            }
            if (last.value == head.value) {
                head = head.next;
                last = head;
            } else {
                return false;
            }
        }
        return true;
    }

    void removeDupsSortedlist() {
        if (head.next == null) {
            return;
        }
        Node first = head;
        Node remove = head;
        while (remove != null) {
            if (first.value == remove.value) {
                remove = remove.next;
            } else {
                first.next = remove;
                remove = remove.next;
                first = first.next;
            }
        }
    }

    void removeDupsUnSortedList() {
//        if (head == null && head.next == null){
//            return;
//        }
//        if(head.value == head.next.value && head.next.next == null){
//            head = head.next;
//        }
//        Node first = head;
//        Node prev = null;
//        Node remove = null;
//        while (first != null && first.next!=null){
//            remove = first.next;
//            prev = first;
//            while (remove!=null){
//                if(first.value == remove.value){
//                    prev.next = remove.next;
//                    remove = remove.next;
//                }
//                else {
//                    prev = remove;
//                    remove = remove.next;
//                }
//            }
//            first = first.next;
//        }

        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.value;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }

    void swapLinkedList(int x, int y) {
        Node traverse = head;
        Node first = null;
        Node second = null;
        if (x == y) {
            return;
        }
        while (traverse.next != null) {
            if (traverse.next.value == x) {
                first = traverse;
            }
            if (traverse.next.value == y) {
                second = traverse;
            }
            traverse = traverse.next;
        }
        if (first != null && second != null) {
            Node temp1 = first.next;
            first.next = second.next;
            second.next = temp1;
            Node temp = first.next.next;
            first.next.next = second.next.next;
            second.next.next = temp;

        } else {
            Node temp1 = head;
            Node temp3 = second.next.next;
            head = second.next;
            second.next = temp1;
            Node temp = second.next.next;
            second.next.next = temp3;
            head.next = temp;

        }


//        if (x == y) return;
//
//        // Search for x (keep track of prevX and CurrX)
//        Node prevX = null, currX = head;
//        while (currX != null && currX.value != x)
//        {
//            prevX = currX;
//            currX = currX.next;
//        }
//
//        // Search for y (keep track of prevY and currY)
//        Node prevY = null, currY = head;
//        while (currY != null && currY.value != y)
//        {
//            prevY = currY;
//            currY = currY.next;
//        }
//
//        // If either x or y is not present, nothing to do
//        if (currX == null || currY == null)
//            return;
//
//        // If x is not head of linked list
//        if (prevX != null)
//            prevX.next = currY;
//        else //make y the new head
//            head = currY;
//
//        // If y is not head of linked list
//        if (prevY != null)
//            prevY.next = currX;
//        else // make x the new head
//            head = currX;
//
//        // Swap next pointers
//        Node temp = currX.next;
//        currX.next = currY.next;
//        currY.next = temp;

    }

    void reverseList() {
        Node prev = null;
        Node traverse = head;
        Node curr = head;
        while (curr != null) {
            traverse = curr;
            curr = curr.next;
            traverse.next = prev;
            prev = traverse;
        }
        head = prev;
    }

    static class Node {
        int value;
        Node next;

        public Node(int data) {
            value = data;
        }
    }
}

public class SLinkedList {
    public static void main(String[] args) {
        LinkedListImp first = new LinkedListImp();
        LinkedListImp second = new LinkedListImp();
        first.insert(first, 2);
        first.insert(first, 12);
        first.insert(first, 21);
        first.insert(first, 24);
        first.insert(first, 112);
        first.insert(first, 32);
        first.insert(first, 25);
        first.insert(first, 72);
        first.print(first);
        first.reverseList();
        first.print(first);
    }
}
