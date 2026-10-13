package com.java.deepunderstanding;

class Exercise1 {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    Exercise1() {
        System.out.println("Constructor");
    }


}

public class Understanding {

    public static void main(String[] args) {
        Exercise1 e1 = new Exercise1();
    }

}
