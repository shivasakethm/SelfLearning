package ctci.stacksandqueues;


import java.util.LinkedList;
import java.util.Queue;

class StackusingQueues {

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    int size = 0;


    void add(int data) {
        queue1.add(data);
    }

    void pop() {
        if (queue1.isEmpty()) {
            System.out.println("Empty");
            return;
        }
        size--;
        int x = queue1.remove();
        System.out.println("popped element " + x);
    }

    void push(int data) {
        size++;
        queue2.add(data);
        while (!queue1.isEmpty()) {
            int x = queue1.remove();
            queue2.add(x);
        }
        Queue<Integer> q = new LinkedList<>();
        queue1 = queue2;
        queue2 = q;
    }


}

public class StackusingQueue {

    public static void main(String[] args) {

        StackusingQueues first = new StackusingQueues();
        first.pop();
        first.push(3);
        first.push(5);
        first.push(6);
        first.push(7);
        first.push(2);
        first.push(3);
        first.pop();
        first.pop();
        first.pop();

    }
}
