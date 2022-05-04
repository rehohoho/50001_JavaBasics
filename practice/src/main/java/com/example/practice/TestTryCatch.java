package com.example.practice;

public class TestTryCatch {
    public static void main (String[] args) {
        try {
            method1();
            method2();
        } catch (IllegalArgumentException e) {
            System.out.println("main IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("main RuntimeException");
        }
    }

    public static void method1() {
        System.out.println("entered method1");
        try {
            method2();
        } catch (IllegalArgumentException e) {
            System.out.println("method1 IllegalArgumentException");
        }
        System.out.println("exited method1");
    }

    public static void method2() {
        System.out.println("entered method2");
        throw new IllegalArgumentException();
    }
}
