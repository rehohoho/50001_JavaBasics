package com.example.ps1a.week1;

import com.example.ps1a.Tester;

import java.util.ArrayList;
import java.util.List;

public class IteratorForEachTest extends Tester<Integer> {

    public IteratorForEachTest(Integer[] inputs) {
        super(inputs);
    }

    @Override
    public void run(Integer n) {
        // Generate the input ArrayList
        List<Integer> integerList = new ArrayList<>();
        for( int i = 1; i <= n; i++){
            integerList.add(i);
        }

        //Recall that 1 + 2 + .. + n = n(n+1)/2.
        String ans = "" + IteratorForEach.Act2ForEach(integerList);
        ans = "Iterator Sum = " + ans;
        System.out.println(ans);
    }
}
