package ctci.stacksandqueues;

import java.util.Stack;

class Queue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    int pop() {
        if (stack1.size() == 0) {
            System.out.println("Empty Queue");
            return -1;
        }
        return stack1.pop();
    }

    void enQueue(int data) {

        stack1.push(data);
    }

    void deQueue() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    void print() {
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }
        System.out.println();
    }


}

public class QueueImpl {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enQueue(3);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(2);
        queue.enQueue(9);
        queue.print();
        queue.deQueue();
        queue.print();
    }

}
