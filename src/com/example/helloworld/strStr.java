package com.example.helloworld;

class SolutionstrStr {
    public int strStr(String haystack, String needle) {

        if (needle == null) return 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            System.out.println(i);
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}

public class strStr {

    public static void main(String[] args) {

        SolutionstrStr solutionstrStr = new SolutionstrStr();
        solutionstrStr.strStr("hello", "ll");
    }
}
