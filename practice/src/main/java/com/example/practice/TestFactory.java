package com.example.practice;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println(Tea.tehkosong());
        System.out.println(Tea.teh());
        System.out.println(TeaSingleton.getInstance());
    }
}

class Tea {
    private boolean sugar;
    private boolean milk;

    private Tea(boolean sugar, boolean milk){
        this.sugar = sugar;
        this.milk = milk;
    }

    public static Tea teh(){
        return new Tea(true, true);
    }

    public static Tea tehkosong(){
        return new Tea(false, true );
    }

    @Override
    public String toString() {
        return "Tea{" +
                "sugar=" + sugar +
                ", milk=" + milk +
                '}';
    }
}

class TeaSingleton {
    private static TeaSingleton instance = null;
    private boolean sugar;
    private boolean milk;

    private TeaSingleton(boolean sugar, boolean milk) {
        this.sugar = sugar;
        this.milk = milk;
    }

    public static TeaSingleton getInstance() {
        if (instance == null) {
            instance = new TeaSingleton(false, false);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "TeaSingleton{" +
                "sugar=" + sugar +
                ", milk=" + milk +
                '}';
    }
}
