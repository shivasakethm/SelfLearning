package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> eachListItem = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    eachListItem.add(1);
                    continue;
                }

                if (j == i) {
                    eachListItem.add(1);
                    continue;
                }
                eachListItem.add(previous.get(j) + previous.get(j - 1));
            }
            previous = eachListItem;
            result.add(eachListItem);

        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(generate(5));

    }
}
