package com.example.ps1a.week2;

import java.util.HashMap;
import java.util.HashSet;

public class Pset1 {

    public static boolean isAllCharacterUnique(String sIn) {
        HashSet<Character> hashSet = new HashSet<>();
        char[] chars1 = sIn.toCharArray();

        for (char ch: chars1) {
            if (hashSet.contains(ch)) {
                return false;
            }
            hashSet.add(ch);
        }

        return true;
    }
    
    public static boolean isPermutation(String sIn1, String sIn2) {
        
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars1 = sIn1.toCharArray();
        char[] chars2 = sIn2.toCharArray();
        
        for (char ch: chars1) {
            if (!hashMap.containsKey(ch)) {
                hashMap.put(ch, 0);
            }
            hashMap.put(ch, hashMap.get(ch) + 1);
        }

        for (char ch: chars2) {
            if (!hashMap.containsKey(ch)) {
                return false;
            }
            hashMap.put(ch, hashMap.get(ch) - 1);
            if (hashMap.get(ch) == 0) {
                hashMap.remove(ch);
            }
        }
        
        return true;
    }

}
