package Ejercicio5;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String,String> text =(s, s2) -> s.equals(s2);
        System.out.println(text.test("Japon","Jabón"));
        System.out.println(text.test("Japon","Japon"));
    }
}
