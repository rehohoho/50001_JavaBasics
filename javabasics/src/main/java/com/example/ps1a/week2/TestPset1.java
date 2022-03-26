package com.example.ps1a.week2;

import com.example.ps1a.Tester;

public class TestPset1 extends Tester<String> {

    public TestPset1(String[] inputs) {
        super(inputs);
    }

    @Override
    public void run(String input) {
        System.out.println(Pset1.isAllCharacterUnique("abcdefghijklmnopqrstuvABC"));
        System.out.println(Pset1.isAllCharacterUnique("abcdefgghijklmnopqrstuvABC"));
        System.out.println(Pset1.isPermutation("@ab", "a@b"));
        System.out.println(Pset1.isPermutation("abcd", "bcdA"));
    }

}
