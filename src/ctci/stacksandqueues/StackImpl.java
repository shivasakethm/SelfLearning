package ctci.stacksandqueues;


class Stack {
    final int max = 300;
    int top;
    int[] a = new int[max];

    Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int value) {
        if (top >= max - 1) {
            System.out.println("Stack is full");
            return;
        }
        top = top + 1;
        a[top] = value;
    }

    void print() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    int peek() {
        if (top < 0) {
            return -1;
        }
        return a[top];
    }

    int pop() {
        if (top < 0) {
            return -1;
        }
        int temp = a[top];
        top--;
        return temp;
    }

}

public class StackImpl {

    public static void main(String[] args) {

        Stack first = new Stack();
        first.print();
        first.push(2);
        first.push(3);
        first.push(4);
        first.push(6);
        first.print();
        System.out.println(first.isEmpty());
        System.out.println(first.peek());
        System.out.println(first.pop());
        System.out.println(first.pop());
        first.print();
    }
}
