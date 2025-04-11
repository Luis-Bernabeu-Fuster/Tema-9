package Ejercicio3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> num =integer -> integer > 100 || integer < 50;
        System.out.println(num.test(120));
        System.out.println(num.test(100));
        System.out.println(num.test(11));
        System.out.println(num.test(50));
    }
}
