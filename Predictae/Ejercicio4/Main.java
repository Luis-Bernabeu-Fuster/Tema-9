package Ejercicio4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> num =integer -> integer!=100;
        System.out.println(num.test(99));
        System.out.println(num.test(100));
        System.out.println(num.test(101));
    }
}
