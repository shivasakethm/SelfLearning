package ctci.LinkedList;

public class RemoveDuplicates {

    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 4);
        list.insert(list, 3);
        list.insert(list, 9);
        list.print(list);
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        removeDuplicates.removeDuplicates(list, 4);
        list.print(list);
    }

    void removeDuplicates(LinkedListImp list, int value) {
        LinkedListImp.Node node = list.head;
        LinkedListImp.Node prev = null;
        if (node.value == value) {
            list.head = node.next;
        } else {
            while (node.next != null) {
                if (node.value == value) {
                    prev.next = node.next;
                } else {
                    prev = node;
                    node = node.next;
                }
            }
        }
    }
}
