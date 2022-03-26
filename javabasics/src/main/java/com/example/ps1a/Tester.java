package com.example.ps1a;

public abstract class Tester<T> {

    public Tester(T[] inputs) {
        for (T input : inputs) {
            run(input);
        }
    }

    public abstract void run(T input);

}
