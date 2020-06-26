package Algorithms;

import java.util.HashMap;

public class HashMapDebug {

    public static void main(String[] args) {

        String s1 = "FBFB";
        String s2 = "Ea";
        System.out.println(s1.hashCode() + " " + s2.hashCode());
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
            char eachChar = s1.charAt(i);
            if (hashMap.keySet().contains(eachChar)) {
                System.out.println("Not a uniques String");
                break;
            } else {
                hashMap.put(eachChar, 1);
            }
        }
    }
}
