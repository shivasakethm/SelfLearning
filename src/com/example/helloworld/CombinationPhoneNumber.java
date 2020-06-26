package com.example.helloworld;

import java.util.HashMap;

public class CombinationPhoneNumber {
    static void combination(HashMap<Character, String> hashMap, String main, String substring) {

//        if (substring.length() >= 1){
//            for (int i = 0; i < main.length(); i++) {
//
//            }
//        }

        if (main.length() == 0) {
            System.out.println(substring);
            return;
        }

        System.out.println(substring);
        combination(hashMap, main.substring(0, main.length() - 1), main.substring(main.length() - 1));

    }

    public static void main(String[] args) {

        HashMap<Character, String> hashMap = new HashMap<>();
        hashMap.put('2', "abc");
        hashMap.put('3', "def");
        hashMap.put('4', "ghi");
        hashMap.put('5', "jkl");
        hashMap.put('6', "mno");
        hashMap.put('7', "pqrs");
        hashMap.put('8', "tuv");
        hashMap.put('9', "wxyz");

        combination(hashMap, "123", "");
    }
}
