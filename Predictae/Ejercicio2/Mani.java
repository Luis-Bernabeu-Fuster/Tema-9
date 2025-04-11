package Ejercicio2;

import java.util.function.Predicate;

public class Mani {
    public static void main(String[] args) {
        Predicate<Integer> num =integer -> integer > 100 && integer < 300;
        System.out.println(num.test(150));
        System.out.println(num.test(300));
        System.out.println(num.test(99));
    }
}
