package ctci.stacksandqueues;


import java.util.Stack;

class dummy extends Stack<Integer> {

    Stack<Integer> stack = new Stack<>();

    void push(int x) {

        if (isEmpty()) {
            super.push(x);
            stack.push(x);
        } else {
            super.push(x);
            int y = stack.pop();
            stack.push(y);
            if (x < y) {
                stack.push(x);
            } else {
                stack.push(y);
            }
        }
    }

//    public Integer pop(){
//
//        int x = super.pop();
//        int y = stack.pop();
//        if(x!=y){
//            stack.push(y);
//        }
//        return x;
//    }

    public Integer pop() {
        System.out.println("Element popped");
        int x = super.pop();
        stack.pop();
        return x;
    }

    int getMin() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }
        int y = stack.pop();
        stack.push(y);
        return y;
    }

    void print() {
        if (stack.isEmpty() == true) {
            System.out.println("List empty");
            return;
        }
        for (int i = 0; i < stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}

public class SpecialStack {

    public static void main(String[] args) {
        System.out.println();
        dummy dummy = new dummy();
        dummy.print();
        dummy.push(3);
        dummy.push(3);
        dummy.push(2);
        dummy.push(1);
        dummy.push(3);
        dummy.print();
        dummy.pop();
        dummy.print();
        System.out.println("--------------");
        System.out.println(dummy.getMin());
    }
}
