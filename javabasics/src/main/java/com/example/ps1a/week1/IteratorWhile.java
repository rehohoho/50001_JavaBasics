package com.example.ps1a.week1;

import java.util.*;

public class IteratorWhile {

    public static int Act2Iterator(List<Integer> integers) {
        int sum = 0;
        Iterator<Integer> intIterator = integers.iterator();
        while (intIterator.hasNext()) {
            sum += intIterator.next();
        }
        return sum;
    }

}
