package Algorithms;

public class Recursion {

    static int factorial(int n) {
        int i = 1;
        if (n == 1) {
            System.out.println("i am here in if " + i);
            i = i + 1;
            return 1;
        } else {
            System.out.println("i am here in else " + i);
            i = i + 1;
            return n * factorial(n - 1);
        }
    }

    static int fibonacci(int n) {
        int pre = 1;
        int ppre = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
//                System.out.println(1);
                continue;
            } else {
                int present = pre + ppre;
//                System.out.println(present);
                ppre = pre;
                pre = present;

            }

        }
        while (n < 0) {
            if (n == 1 || n == 2) {
                return 1;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return pre;
    }

    public static void main(String[] args) {
//        int result = factorial(5);
//        System.out.println(result);
        int fibResult = fibonacci(7);
        System.out.println(fibResult);
    }
}
