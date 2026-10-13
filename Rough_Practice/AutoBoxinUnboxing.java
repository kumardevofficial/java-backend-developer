package Rough_Practice;

public class AutoBoxinUnboxing {
    public static void main(String[] args) {
        // Autoboxing
        int x = 10;
        Integer y = x; // autoboxing
        System.out.println(x);
        System.out.println(y); // unboxing
        // Unboxing
        Integer a = 20; // Autoboxing
        int b = a; // unboxing
        System.out.println(a); // unboxing
        System.out.println(b);

        Integer value = 50;
        printValue(value);

        int myValue = 55;
        printMyValue(myValue);

        Integer num1 = 5;
        Integer num2 = 10;
        int sum = num1 + num2;
        System.out.println(sum);

        Integer g = null;
        int h = g;
        System.out.println(h); // this will give us nullPointerException

    }

    static void printValue(int a){
        System.out.println(a);
    }

    static  void printMyValue(Integer a){
        System.out.println(a);
    }
}

// Assigment
// method
// arithmeetic