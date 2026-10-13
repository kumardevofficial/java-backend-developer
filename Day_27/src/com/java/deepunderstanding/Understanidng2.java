package com.java.deepunderstanding;

class Exercise2 {

    static {
        System.out.println("A");      // ABCBCBC
    }

    {
        System.out.println("B");
    }

    Exercise2() {
        System.out.println("C");
    }
}

public class Understanidng2 {

    public static void main(String[] args) {
        Exercise2 e1 = new Exercise2();
        Exercise2 e2 = new Exercise2();
        Exercise2 e3 = new Exercise2();
    }

}
