package com.example.practice;

public class TestNestedClass {

    public static void main(String[] args) {

        // Static inner class with static method: no instances needed
        A1.StaticInnerClass.staticInnerMethod();

        // Static inner class with static var: no instances needed
        A1.StaticInnerClass.staticInnerVar = 2;

        // Static inner class with normal method: need instance of A.StaticInnerClass NOT A
        new A1.StaticInnerClass().innerMethod();

        // Static inner class with normal var: need instance of A.StaticInnerClass NOT A
        new A1.StaticInnerClass().innerVar = 2;

        // Normal inner class with normal method: need instance of com.example.practice.A2 AND com.example.practice.A2.InnerClass
        new A2().new InnerClass().innerMethod();
    }

}

class A1 {
    static class StaticInnerClass {
        int innerVar = 111;
        static int staticInnerVar = 111;

        // can be called without any instances
        static void staticInnerMethod(){
            System.out.println("Method B");
        }

        // need instance of StaticInnerClass
        // !! Cannot call non-static methods
        void innerMethod() {

        }
    }
}

class A2 {
    class InnerClass {
        // need com.example.practice.A2.InnerClass instance
        void innerMethod(){
            System.out.println("Method B2");
        }
    }
}
