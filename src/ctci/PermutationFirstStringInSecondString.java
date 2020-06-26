package ctci;

import java.util.HashMap;

class Permutation {

    boolean isPermutation(String string1, String string2) {
        System.out.println(string1 + " " + string2);
        if (string1.length() != string2.length()) {
            return false;
        }
        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < string1.length(); i++) {
            char char_string1 = string1.charAt(i);
            char char_string2 = string2.charAt(i);
            if (hashMap1.containsKey(char_string1)) {
                int count = hashMap1.get(char_string1);
                hashMap1.put(char_string1, count + 1);
            } else {
                hashMap1.put(char_string1, 1);
            }

            if (hashMap2.containsKey(char_string2)) {
                int count = hashMap2.get(char_string2);
                hashMap2.put(char_string2, count + 1);
            } else {
                hashMap2.put(char_string2, 1);
            }

        }
        for (int i = 0; i < string1.length(); i++) {
            char comparechar = string1.charAt(i);
            if (hashMap1.get(comparechar) != hashMap2.get(comparechar)) {
                return false;
            }
        }
        return true;
    }

    boolean bookSolution(String string1, String string2) {
        int[] count_set = new int[128];
        char[] char_set = string1.toCharArray();
        if (string1.length() != string2.length()) {
            return false;
        }
        for (char c : char_set) {
            count_set[c]++;
        }
        char[] char_set2 = string2.toCharArray();
        for (char c : char_set2) {
            count_set[c]--;
            if (count_set[c] < 0) {
                return false;
            }
        }
        return true;
    }
}

public class PermutationFirstStringInSecondString {
    public static void main(String[] args) {
        String string1 = "ssethe";
        String string2 = "seeths";
        Permutation permutation = new Permutation();
        boolean result = permutation.isPermutation(string1, string2);
        long startTime = System.nanoTime();
        boolean result1 = permutation.bookSolution(string1, string2);
        System.out.println(result);
        System.out.println(result1);
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime;
        System.out.println(totalTime1);
    }
}
