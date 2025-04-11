package Ejercicio1;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> num =integer -> integer > 100;
        System.out.println(num.test(101));
        System.out.println(num.test(100));
    }
}
