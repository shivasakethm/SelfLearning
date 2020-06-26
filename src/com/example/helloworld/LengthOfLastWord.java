package com.example.helloworld;

public class LengthOfLastWord {
    public static int lastword(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) == ' ') {
                return count;
            }
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {

        String string = "the fox has arrived ";
        int result = lastword(string);
        System.out.println(result);

    }
}
