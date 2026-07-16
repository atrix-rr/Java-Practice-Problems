import java.util.*;

class MethodOverLoading

{
    static void Add(int a, int b) {
        int sum = a + b;

        System.out.println("The Sum of Integers:" + sum);
    }

    static void Add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The Sum is:" + sum);

    }
}

class sum {
    public static void main(String args[]) {
        System.out.println("Complete Program");
    }
}
