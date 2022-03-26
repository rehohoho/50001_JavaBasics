package com.example.ps1a.week1;

import java.util.*;

public class IteratorForEach {

    public static int Act2ForEach(List<Integer> integers) {
        int sum = 0;
        for (Iterator<Integer> intIterator = integers.iterator(); intIterator.hasNext();) {
            sum += intIterator.next();
        }
        return sum;
    }

}
