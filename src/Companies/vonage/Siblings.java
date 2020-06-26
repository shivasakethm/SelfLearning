package Companies.vonage;

import java.util.ArrayList;
import java.util.Collections;

public class Siblings {

    static int sibling(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (n > 0) {
            int x = n % 10;
            arrayList.add(x);
            n = n / 10;
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList.toString());
        int finalResult = 0;
        for (Integer i : arrayList
        ) {
            finalResult = finalResult * 10 + i;
        }
        System.out.println(finalResult);
        return 0;

//        if (N < 10) return N;
//
//        int[] digits = new int[10];
//
//        while (N > 0) {
//            int currDigit = N % 10;
//            digits[currDigit]++;
//            N /= 10;
//        }
//
//        int largestSibling = 0;
//        for (int i = 9; i >= 0; i--) {
//            if (digits[i] > 0) {
//                int repetitions = digits[i];
//                while (repetitions-- > 0) {
//                    largestSibling = largestSibling * 10 + i;
//                }
//            }
//        }
//
//        return largestSibling;
    }

    public static void main(String[] args) {

        System.out.println(sibling(8549));

    }
}
